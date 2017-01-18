package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		
			printDuplicateCharacters("Programming");
	}
			public static void printDuplicateCharacters(String s){
				HashMap<Character, Integer> map = new HashMap<Character, Integer>();
				char a[]= s.toCharArray();
				for(Character ch: a){
					if(map.containsKey(ch)){
						map.put(ch, map.get(ch)+1);
					}
					else{
						map.put(ch, 1);
					}
					
				}
				Set<Map.Entry<Character, Integer>> entrySet = map.entrySet(); 
				System.out.printf("List of duplicate characters in String '%s' %n", s); 
				for (Map.Entry<Character, Integer> entry : entrySet) {
					if (entry.getValue() > 1) { 
						System.out.printf("%s : %d %n", entry.getKey(), entry.getValue()); } 
					}

				
}

}
