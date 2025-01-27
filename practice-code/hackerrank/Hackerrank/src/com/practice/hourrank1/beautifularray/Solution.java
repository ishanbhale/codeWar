package com.practice.hourrank1.beautifularray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:/Study/Prog_Input/myfile.txt");
		Scanner sc = new Scanner(file);
        int n = Integer.parseInt(sc.nextLine());
        boolean [] bribed = new boolean[n];
        int [] coins = new int [n];
        int numBribed = 0;
        int cost = 0;
        HashMap<Integer,Integer> costBribe = new HashMap<Integer,Integer>();
        for (int i = 0; i < n; i++){
            String [] input = sc.nextLine().split(" ");
            coins[i] = Integer.parseInt(input[0]);
            costBribe.put(coins[i], Integer.parseInt(input[1]));
        }
        Arrays.sort(coins);
        for (int i = coins.length-1; i >= 0; i--){
            if (!bribed[i] && costBribe.get(coins[i]) <= numBribed){
                bribed[i] = true;
            }
            else if(!bribed[i] && costBribe.get(coins[i]) > numBribed){
                int currentCost = 0;
                int finalIdx = 0;
                int currBribed = numBribed;
                for (int j = 0; j < coins.length; j++){
                    if (!bribed[j]){
                        currentCost+=coins[j];
                        currBribed++;
                        finalIdx = j;
                    }
                    if (currentCost > coins[i]){
                        bribed[i] = true;
                        cost += coins[i];
                        numBribed++;
                        break;
                    }
                    if (currBribed == costBribe.get(coins[i])){
                        numBribed = currBribed;
                        cost += currentCost;
                        for (int k = 0; k <= finalIdx; k++){
                            bribed[k] = true;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(cost);
    }
}