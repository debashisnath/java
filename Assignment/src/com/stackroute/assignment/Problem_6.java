package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_6 {
	
	public String iscapitalorsmallordigit(String str) {
		char c= str.charAt(0);
		if(Character.isLetter(c)) {
			if(Character.isLowerCase(c)) {
				return "Small";
			}
			else
				return "Capital";
		}
		else if(Character.isDigit(c)) {
			return "Digit";
		}
		else if(isSpecialCharacter(c)) {
			return "Special Character";
		}
		else
			return "Wrong input";
		
	}
	public boolean isSpecialCharacter(Character c)
	{
		return c.toString().matches("[^a-z A-Z0-9]");
	}
public static void main(String args[]) {
	String s;
	System.out.println("Enter anything");
	Scanner input= new Scanner(System.in);
	s= input.nextLine();
	input.close();
	Problem_6 x = new Problem_6();
	System.out.println(x.iscapitalorsmallordigit(s));
	/*char c= s.charAt(0);
	if(Character.isLetter(c)) {
		if(Character.isLowerCase(c)){
			System.out.println("Lowercase letter");
		}
		else {
			System.out.println("Uppercase letter");
		}
	}
	//int x= Integer.parseInt(s);
	if(Character.isDigit(c)) {
		System.out.println("It's a digit");
	}
	
	if(isSpecialCharacter(c)) {
		System.out.println("It's a special character");
	}*/
}
}
