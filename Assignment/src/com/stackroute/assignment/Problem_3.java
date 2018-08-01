package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_3 {
public static void main(String []arg) {
	String s;
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the String");
	s= input.nextLine();
	input.close();
	char[] arr= s.toCharArray();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
			System.out.println(arr[i]+" is Vowel");
		}
		else
		{
			System.out.println(arr[i]+" is consonent");
		}
	}
}
}
