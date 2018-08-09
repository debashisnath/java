package com.stackroute.pe3;

import java.util.Arrays;

public class RemVowels {
	public String noVowels(String[] st){
		String s ;
		String s1 = null;
		for(int i = 0; i<st.length; i++) {
			
			s = st[i].replaceAll("a|A|e|E|i|I|o|O|u|U", "").trim()	;
			st[i] = s;
		}
		
		s1 = st[0]+","+st[1]+","+st[2]+","+st[3]+","+st[4];
		
		return s1;
		
	}
	

}
