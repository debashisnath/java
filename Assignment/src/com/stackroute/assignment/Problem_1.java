package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_1 {
public static void main(String []arg) {
	 long  x,sum=0,temp,r,add = 0,y;
	// String s;
	 System.out.println("Enter number");
	 Scanner input=new Scanner(System.in);
	 x =input.nextLong();
	// s= input.nextLine();
	 //x=Long.parseLong(s);
	 temp=x;
	 while(x>0) {
		 r= x%10;
		 sum=(sum*10) + r;
		 x=x/10;
	 }
	 if(sum==temp)
	 {
		 while(temp>0) {
			 y=temp%10;
			 if(y%2==0) {
				 
				 add= add+y;
				 
			 }
			 temp=temp/10;
			 
		 }
		 if(add>25) {
			 System.out.println("Palindrome and sum is greater than 25");
		 }
		 else
			 System.out.println("Palindrome but less than 25");
	 }
	 else
		 System.out.println("Not Palindrome");
	 input.close();
}

}
