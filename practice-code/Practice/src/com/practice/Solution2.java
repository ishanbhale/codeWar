/*package com.practice;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Solution3 s = new Solution3();
System.out.println(s.solution("13 DUP 4 POP 5 DUP + DUP + -"));
System.out.println(s.solution("13 DUP 4 POP 5 DUP + DUP + -"));
	}}



	class Solution2 {
		Integer[] stackArray = new Integer[2000];	    	     	    
	    int top = -1;
	    
		
	    public int solution(String S) {
	    	
	    		
	    	
	    	
	    	
	    	
	        // write your code in Java SE 8
	    	String str = S;
	    	for (String val: str.split(" ")){
	    		if (!(top == -1))peek();
	            System.out.println(val);
	            if (val.equals("POP")){
	            	try {
						pop();
					} catch (Exception e) {
						return -1;
					}
	            }
	            else if (val.equals("DUP")){
	            	try {
						push(peek());
					} 
	            	catch (Exception e) {
						return -1;
					}
	            }
	            
	            else if (val.equals("+")){
	            	try {
						addition();
					} catch (Exception e) {
						return -1;
					}
	            }
	            
	            else   if (val.equals("-")){
	            	try {
						minus();
					} catch (NumberFormatException e) {
						return -1;
					}
	            }
	            
	            else
					try {
						
						push(Integer.valueOf(val));
						
					} catch (NumberFormatException e) {
						return -1;
					}
	         }
	    	
	    	return peek() ;
	    }
	    
	    public Integer pop() {
	        return stackArray[top--];
	     }
	    public void push(Integer j) {
	        stackArray[++top] = j;
	     }
	    public Integer peek() {
	        return stackArray[top];
	     }
	    public long addition() {
	        return stackArray[--top] = peek() + stackArray[top-1] ;
	     }
	    public long minus() {
	        return stackArray[--top] = peek() - stackArray[top-1] ;
	     }
	}
*/