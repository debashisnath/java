package com.stackroute.demo1;

public class Transpose
{

		public String check(String s)
	{
			String s1 = "";
			String[] str = s.split(" ");
            for(int i=0; i<str.length; i++) {
            	for(int j=str[i].length()-1; j>=0; j--) {
            		s1 = s1 + str[i].charAt(j);
            	}
            	s1 = s1 + " "; 
            }
	        
			
			return s1.trim();
	}
	
	
}
