package com.solve.ctci.arraysandstrings.mycode.urlify;

public class Approach1 {

	public static void main(String[] args) {
		String str = "Mr. John Smith     ";
		
	replaceby(str);

	}


static void replaceby(String str){
     int i = 0;
    int whiteSpaces = 0;
    int newLength = 0;
    int trueLength = str.length();
     char[] ch = str.toCharArray();
     
     char[] string;
     for(i = (str.length()-1); i >=0;i--){
    	 trueLength--;
    	 if(ch[i]!=' ')
    		 
    		 break;
     }
	for(;i>=0;i--){
		if(ch[i] ==' ')
		{
		whiteSpaces++;	
		}
	}
	newLength = (whiteSpaces *2) +trueLength;
	for(int j = (trueLength-1); j>=0;j--){
		if(ch[j]== ' '){
			ch[newLength-1] = '0';
			ch[newLength-2] = '2';
			ch[newLength-3] = '%';
			newLength-=3;
		}else{
			ch[newLength-1] = ch[j];
			newLength-=1;
		}
	}
	System.out.println(new String(ch));
	
	/*return str.trim().replace(" ", "%20");*/
}


}