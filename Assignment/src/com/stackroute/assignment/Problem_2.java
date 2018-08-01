package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_2 {
public static void main(String arg[]) {
	int x;
	Scanner input= new Scanner(System.in);
	System.out.println("Enter an Integer:");
	x= input.nextInt();
	if(x%2!=0 && x>=20 && x<=30) {
		System.out.println("Tom");
	}
	else if(x%2==0  && x>=20 && x<=30) {
		System.out.println("Jerry");
	}
	else
		System.out.println("Wrong Input");
	input.close();
}
}
