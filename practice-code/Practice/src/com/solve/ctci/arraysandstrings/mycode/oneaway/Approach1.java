package com.solve.ctci.arraysandstrings.mycode.oneaway;

public class Approach1 {

	public static void main(String[] args) {
		String a = "pae";
		String b = "pale";
		boolean isOneEdit = oneEditAway(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit);

	}
static boolean oneEditAway(String a, String b){
	if(a.length()==b.length()){
		 return oneEditReplace(a, b);
	}else if(a.length()+1 == b.length()){
		return oneEditInsert(b, a);
	}
	else if(b.length()+1 == a.length()){
		return oneEditInsert(a, b);
	}
	
	return false;
}
static boolean oneEditReplace(String a, String b){
	boolean oddFound = false;
	for (int i = 0; i<a.length();i++){
		if(a.charAt(i)!=b.charAt(i)){
			if(oddFound)
				return false;
			oddFound = true;
		}	
	}
	return true;
}

static boolean oneEditInsert(String a, String b){
	boolean oddFound = false;
	int index1 = 0;
	int index2 = 0;
	while(a.length()>index1 && b.length()>index2){
		
		if(a.charAt(index1)!= b.charAt(index2)){
			if(index1!=index2)
				return false;
			index1++;
		}
		else{
			index1++;
			index2++;
		}
	}
		
		
		
		
	return true;

}
	}
