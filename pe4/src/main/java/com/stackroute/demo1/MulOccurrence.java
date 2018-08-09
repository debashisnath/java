package com.stackroute.demo1;

public class MulOccurrence {
public String fun(String a,String b) {
	
	int l = a.length();
	int l1 = b.length();
	int j = 0;
	String s = "";
	for(int i = 0; i < l; i++) {
		if(a.charAt(i) == b.charAt(j) && a.charAt(i+1) == b.charAt(j+1)) {
			int k = i+2;
			s = s + i+"-"+k;
			s = s + ",";
		}
		
	}
	return s.split(",$")[0].trim();
}
}
