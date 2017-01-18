package com.practice;

public class DemoTest1 {

	public static void main(String[] args) {
		DemoTest1 d = new DemoTest1();
		int[] data = { -1, 3, -4, 5, 1, -6, 2, 1};
		System.out.println(d.solution(data));

	}
	int solution(int A[]) {
		int equi=0;
		int i = 0;
		int evaluate = 0;
		int sum = 0;
		for (int a : A){
		    sum += a;
		    
		    }
		System.out.println(sum);
		int lhs = 0;
		int rhs = 0 ;
		for (i = 0; i < A.length;i++)
		
		{
			
			lhs = A[i] +lhs;
			rhs = sum - lhs;
			
			
			if (lhs == rhs) {
			equi = i;
			break;
		}else 
		equi = -1;
	}
		
		return equi;
		
	}	
	    // write your code in C99 (gcc 4.8.2)
	}

