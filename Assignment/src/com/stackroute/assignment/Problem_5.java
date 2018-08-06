package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_5 {
public static void main(String arg[]) {
	String s;
	System.out.println("Enter values:");
	Scanner input= new Scanner(System.in);
	
	s= input.nextLine();
	input.close();
	int sum=0;
	String []arr= s.split(" ");
//	System.out.println(arr[0]);
//	System.out.println(arr[1]);
	for(int i=0;i<arr.length;i++) {
		char ch=arr[i].charAt(0);
	if(Character.isLetter(ch)) {
		System.out.println("Contains character");
	}
	else {
		int x= Integer.parseInt(arr[i]);
		sum= sum+x;
		}
	}
	System.out.println("Total:"+sum);
}
}
