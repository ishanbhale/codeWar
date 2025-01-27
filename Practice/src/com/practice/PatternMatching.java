package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		String str = "push4push20push+-pop20";
		
		StringBuffer sf = new StringBuffer("");
		List<String> ll = new LinkedList<String>();
		
		str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		
		
		System.out.println((Parse(str).toString()));
		System.out.println((ParseNumber(str).toString()));
		System.out.println((ParseNonNumber(str).toString()));
		String[] numbers = str.split("[0-9]+");
		for (String item:numbers){
			System.out.println(item);
			try {
				if(item!=null && !item.equals("")){
				ll.add(item);
				System.out.println("Names"+ll.toString());}
			} catch (NumberFormatException e) {
				System.out.println("Wrong Value");
				e.printStackTrace();
			}
				}
		
		
			String[] items = str.split("[a-zA-Z]+");
			for (String item:items){
				System.out.println(item);
				try {
					if(item!=null && !item.equals("")){
					ll.add(item);
					System.out.println(ll.toString());}
				} catch (NumberFormatException e) {
					System.out.println("Wrong Value");
					e.printStackTrace();
				}
					}
			
			
			 for (String retval: str.split("push")){
		         System.out.println(retval);
		      }	
			
		char[] ch = str.toCharArray();	
			
		for (int i = 0; i < ch.length; i++){
					
			sf.append(ch[i]);
			if(sf.toString().equals("push"))
			{
				
				System.out.println("Push found at " + i);
		//		sf.delete(0, sf.length());
				
			}else if(sf.toString().equals("pop")){
				System.out.println("Pop found at " + i);
			}
		
		
			
		}
		
	
		
	}
	private static List<String> Parse(String str) {
	    List<String> output = new ArrayList<String>();
	    Matcher match = Pattern.compile("[0-9]+|[a-z]+|[A-Z]+|[\\+|\\-(?!\\d)|\\*|/]+").matcher(str);
	    while (match.find()) {
	        output.add(match.group());
	    }
	    return output;
	}
	
	private static List<String> ParseNumber(String str) {
	    List<String> output = new ArrayList<String>();
	    Matcher match = Pattern.compile("[0-9]+").matcher(str);
	    while (match.find()) {
	        output.add(match.group());
	    }
	    return output;
	}
	private static List<String> ParseNonNumber(String str) {
	    List<String> output = new ArrayList<String>();
	    Matcher match = Pattern.compile("[a-z]+|[A-Z]+|[\\+|\\-(?!\\d)|\\*|/]+").matcher(str);
	    while (match.find()) {
	        output.add(match.group());
	    }
	    return output;
	}
	
}
