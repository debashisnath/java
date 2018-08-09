package com.stackroute.demo1;

public class ParaSort {

	public String fun(String a) {
		
		String temp;
		String s1 = "";
		String[] str = a.split(" ");
		int l = str.length;
		for(int i = 0; i < l; i++) {
			for(int j = i + 1; j < l; j++) {
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			s1 = s1 + str[i] + " ";
		}
		
		return s1.trim();
	}
	

}
