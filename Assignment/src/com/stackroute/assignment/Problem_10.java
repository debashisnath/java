package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_10 {
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
	int z= y+x*x;
	char[] array=new char[z];
	for(int i=0;i<y;i++) {
		array[i]= arr[i];
	}
	//System.out.println(s);

	for(int i=y;i<z;i=i+x) {
		for(int j=i; j<y+x;j++) {
			array[j]=arr[j-x];
		}
	}
	for(int i=0;i<z;i++) {
		System.out.print(array[i]);
	}
	input.close();
	//for(int a=z;)
}
}
