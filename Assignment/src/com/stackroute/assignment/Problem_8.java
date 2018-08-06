package com.stackroute.assignment;
import java.util.Random;
import java.util.Scanner;

public class Problem_8 {
public static void main(String arg[]) {
	Random rand= new Random();
	int rand_int= rand.nextInt(51);
	System.out.println("Enter any number:");
	int x;
	Scanner input= new Scanner(System.in);
	x= input.nextInt();
	if(x> rand_int) {
		System.out.println("More than the original number");
	}
	else if(x< rand_int) {
		System.out.println("Less than the original number");
	}
	else
		System.out.println("Equals to the original number");
	input.close();
}
}
