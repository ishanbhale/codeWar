package com.solve.hackerrank;

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String str = "Welcometo java";
        int i = 3;
        String a = "";
        String b = "";
        for(int j = 0 ; j < str.length() - i+1;j++){
        	String x = str.substring(j,j+i);
        	
        	if (j==0){
        		a = x;
        		b = x;
        	}
        	else{
        	 	if(x.compareTo(a)<0){
        	 		a=x;
        	}else if(x.compareTo(b)>0){
        		b=x;
        	}
        	}
        	
        }
        System.out.println(a + "\n"+b);
    }
	
	  /*public static void main(String []args){ 
          Scanner in = new Scanner(System.in);
          String s ="welcometo java";
          String outmin = "",outmax = "";
          int k = 3;
          for(int i=0;i<s.length()-k+1;i++){
              String w = "";
              for(int j=i;j<i+k;j++)
              	w+=s.charAt(j);
              if(i==0){
              	outmin=w;outmax=w;
              }
              else{
                  if(w.compareTo(outmin)<0)
                  	outmin=w;
                  if(w.compareTo(outmax)>0)
                  	outmax=w;
              }

          }
          System.out.println(outmin);
          System.out.println(outmax);
    }*/
}
;