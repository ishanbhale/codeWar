package com.solve.hackerrank;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.Scanner;

	class IPRegex{

	    public static void main(String []args)
	    {
	        
	        {
	            String IP = "000.12.12.034";
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}

	//YOU SHOULD ONLY SUBMIT THE FOLLOWING BLOCK
	class MyRegex
	{
	         String pattern = 
	            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
	            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	}

