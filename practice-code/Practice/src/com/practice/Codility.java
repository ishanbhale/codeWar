package com.practice;

public class Codility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solution c = new Solution();
		c.solution(100);
	}
		
		
	}

	class Solution {
	    public void solution(int N) {
	        // write your code in Java SE 8
	    	
	         for (int i = 1; i <= N; i++){
	        	 if (i % (3*5) == 0){
	                 System.out.println("FizzBuzz");
	                 }
	        	 else  if (i % (3*7) == 0){
	                 System.out.println("FizzWoof");
	                 }
	             else if (i % (5*7) == 0){
	                 System.out.println("BuzzWoof");
	                 }
	             else if (i % (3*5*7) == 0){
	                 System.out.println("FizzBuzzWoof");
	                 }
	        	 else  if (i % 3 == 0){
	                 System.out.println("Fizz");
	                 }
	             else if (i % 5 == 0){
	                 System.out.println("Buzz");
	                 }
	             else if (i % 7 == 0){
	                 System.out.println("Woof");
	                 }  
	             else{
	            	 System.out.println(i);
	             }
	             }
	    	
	    	
	    	
	    	
	    	
	    }
	}
	
	
	

