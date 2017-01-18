package com.solve.ctci.arraysandstrings.mycode.permutation;

import java.util.Arrays;

public class Approach1 {
public static void main(String[] args){
	String[][] pairs = {{"apple", "pplea",},{"abcde","aabvb"}};
	
	for (String[] pair: pairs){
		System.out.println(isPermutation(pair));
	}
}

static boolean isPermutation(String[] pair){
	
	String word1 = pair[0];
	String word2 = pair[1];
	if(word1.length() != word2.length())
		return false;	
	
	
	char[] ch1 = word1.toCharArray();
	char[] ch2 = word2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	for(int i = 0; i<word1.length();i++){
		if(ch1[i] != ch2[i])
			return false;
	}
	return true;
}
}
