package com.stackroute.assignment;

import java.util.Scanner;

public class P10 {
	public static void main(String []args) {
		String s;
		int x;
		System.out.println("Enter the string:");
		Scanner input= new Scanner(System.in);
		s= input.nextLine();
		System.out.println("Enter the integer");
		x= input.nextInt();
		char []arr= s.toCharArray();
		int y= arr.length;
		System.out.print(s);
		for(int i=0;i<x;i++) {
			for(int j=y-x;j<y;j++) {
				System.out.print(arr[j]);
			}
		}
		input.close();
	}
}
