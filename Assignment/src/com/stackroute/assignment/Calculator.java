package com.stackroute.assignment;

import java.util.Scanner;

public class Calculator {
	static int sum(int a, int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	static int rem(int a,int b) {
		return a%b;
	}
public static void main(String []arg) {
	System.out.println("Enter first integer");
	Scanner input= new Scanner(System.in);
	int x= input.nextInt();
	System.out.println("Enter second integer");
	int y= input.nextInt();
	System.out.println("Enter the operation you want");
	System.out.println("1. Addition");
	System.out.println("2. Substraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	System.out.println("5. Remainder");
	int z= input.nextInt();
	input.close();
	switch(z) {
	case 1:
		System.out.println("Result:"+sum(x,y));
		break;
	case 2:
		System.out.println("Result:"+sub(x,y));
		break;
	case 3:
		System.out.println("Result:"+mul(x,y));
	case 4:
		System.out.println("Result:"+div(x,y));
		break;
	case 5:
		System.out.println("Result:"+rem(x,y));
	default:
		System.out.println("Wrong Choice");
	}
}
}
