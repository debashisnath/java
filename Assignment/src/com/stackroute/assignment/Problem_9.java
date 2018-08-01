package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_9 {
public static void main(String arg[]) {
		String s;
		System.out.println("Enter any string:");
		Scanner input= new Scanner(System.in);
		s= input.nextLine();
		int size= s.length();
		char[] arr=s.toCharArray();
		for(int i=size-1; i>=0;i--) {
			System.out.print(arr[i]);
		}
		input.close();
}
}
