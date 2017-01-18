package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepeatedCharacter {
public static void main (String s[]){
	getNonRepeatedCharacter("programming");
}
	public static void getNonRepeatedCharacter(String s){
	char charac[] = s.toCharArray();
	Map <Character, Integer> m = new HashMap<Character, Integer>();
	for (Character ch : charac){
		
		if(m.containsKey(ch)){
			m.put(ch,m.get(ch) + 1);
			}
		else{
			m.put(ch,1);
		}
		
	}
	
	
	for (Entry<Character,Integer> entry : m.entrySet()) { 
		if (entry.getValue() == 1) 
		{ 
			System.out.println(entry.getKey()); 
			break;
		}
	}

	
	
	
}

}
