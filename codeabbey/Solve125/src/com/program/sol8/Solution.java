package com.program.sol8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:/Study/Prog_Input/myfile.txt");
		Scanner in = new Scanner(file);
		int value = 0;
		int i = 0;
		int t = in.nextInt();
		while(i < t){
			System.out.println(Math.round(Math.sqrt(in.nextInt())));
			i++;
		}
		
	}
}
