package com.solve.ctci.arraysandstrings.mycode.palindromepermutation;

public class Approach1 {
public static void main(String[] arg){
	String str = "Rats live on no evil star";
	System.out.println();
	System.out.println(isPalindromePermutation(str));
}

static boolean isPalindromePermutation(String str){
	int[] table= new int[Character.getNumericValue('z') - Character.getNumericValue('a')];
	boolean oddFound = false;
	int x = 0;
	for(char ch:str.toCharArray()){
		
		if(ch != ' '){
			x =  Character.getNumericValue(ch)- Character.getNumericValue('a');
			table[x]++;
		}
	
	}
	for(int t : table){
		
		if(t%2!=0){
			if(oddFound){
			return false;}
		}else{
			oddFound = true;
		}
	}
	return oddFound;
}
}
