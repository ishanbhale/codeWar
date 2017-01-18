package com.solve.ctci.arraysandstrings.mycode;

public class UniqueA {
	
	
	public static void main(String args[]){
	String words[] = {"abcde", "apple"};
	for (String word: words){
	System.out.println(word + ":  "+isUniqueChars(word));
	}
}

	private static boolean isUniqueChars(String word) {
		// TODO Auto-generated method stub
		if(word.length()>128){
			return false;
		}
		boolean[] charset = new boolean[128];
		for(int i = 0; i <word.length();i++){
			int val = word.charAt(i);
			if(charset[val]){
				return false;
			}
			charset[val] = true;
		}
		return true;
	}

}
