package com.stackroute.test;

import java.util.Scanner;

public class Problem_5 {
//	public int check(int x) {
//		return x;
//		
//	}
//	public String split(String s) {
//		String arr= s.split(" ");
//		return arr;
//	}
	public int letter(String str, int length) {
		int flag = 0;String[] arr= str.split(" ");
		for(int i=0; i<length; i++) {
			char ch = arr[i].charAt(0);
			if(Character.isLetter(ch)) {
				flag = 1;
			}
			else
				flag = 0;
		}
		return flag;
	}
	public int sum(String str, int length) {
		int sum = 0;String[] arr= str.split(" ");
		for(int i=0; i<length; i++) {
			char ch = arr[i].charAt(0);
			if(!Character.isLetter(ch)) {
				int x= Integer.parseInt(arr[i]);
				sum= sum+x;
			}
			
		}
		return sum;
	}
public static void main(String[] arg) {
	String str;
	System.out.println("Enter any value");
	Scanner input = new Scanner(System.in);
	str = input.nextLine();
	String[] arr= str.split(" ");
	Problem_5 a = new Problem_5();
//	String[] str= a.split(s);
	int l= arr.length;
	//for(int i=0; i<l; i++) {
	//System.out.print(arr[i]);}
	
	int b =a.letter(str,l);
	if(b==1) {
		System.out.println("Contains Letter");
	}
	int c = a.sum(str, l);
	System.out.println("Total:"+c);
	input.close();
	
}
}
