package com.practice.geekforgeeks.twosets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:/Study/Prog_Input/myfile.txt");
		Scanner in = new Scanner(file);
		 int n = in.nextInt();
	     int k = in.nextInt();
	     int j = n-1;
	     int x = 0;
	     
	      int[] a = new int[n] ;
	       for(int i = 0; i < n; i++){
	    	   a[i] = in.nextInt();
	       }
	       int z[] = new int[k];
	       while(x!=n-3)
	       {
	    	 int i = x;
	    	 int y = 0;
	    	 while(y!= k){
	    	  z[y] = a[i];
	    	  y++;
	    	  i++;
	    	  }
	    	 
	    	 
	    	 
	    	 x++;
	       }
           
	      
	      
	      
	      
	      
	      
    }
        }