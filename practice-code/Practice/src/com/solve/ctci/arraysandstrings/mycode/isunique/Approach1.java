package com.solve.ctci.arraysandstrings.mycode.isunique;

public class Approach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] words = {"apple", "abcde", "aadffe"};
for (String word: words){
	System.out.println(word+" is unique: "+ isUnique(word));
}
	}
		static boolean isUnique(String word){
			if(word.length()>128)
				return false;
			
			boolean[] ch = new boolean[128];
			for(int i = 0; i<word.length();i++){
				int val = word.charAt(i);
				if(ch[val]){
					return false;
				}else{
					ch[val] = true;
				}
			}
			return true;
	
	
	}
}
