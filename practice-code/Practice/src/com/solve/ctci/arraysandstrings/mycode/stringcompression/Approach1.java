package com.solve.ctci.arraysandstrings.mycode.stringcompression;

public class Approach1 {
public static void main(String []a){
	String str = "aaaaaaaaaaaaaaaaaaaaaaaabedef";
	shouldStringCompress(str);
	
}

private static void shouldStringCompress(String str) {
	int consecutiveCount = 0;
	String newStr = "";
	for(int i = 0; i<str.length();i++){
		consecutiveCount++;
		if(str.length() > i+1 && (str.charAt(i+1)!=str.charAt(i))){
			{
			newStr = newStr + str.charAt(i)+ consecutiveCount;
			consecutiveCount = 0;
			}
			
		}
	}
	
	System.out.println(str.length()>newStr.length()?newStr:str);
}


}
