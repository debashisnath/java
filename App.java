package com.stackroute.test;

/**
 * Hello world!
 *
 */


import java.util.Scanner;

public class App {
	
	
	public boolean capital(char c) {
		if(Character.isUpperCase(c)) 
			return true;
		else
		   return false;
		
	}
	public boolean small(char c) {
		if(Character.isLowerCase(c)) 
			return true;
		else
		   return false;
		
	}
	public boolean digit(char c) {
		
		if(Character.isDigit(c))
			return true;
		else
			return false;
	}
	public boolean special(char c) {
		
		if(isSpecialCharacter(c))
			return true;
		else
		return false;
		
			
	}
	public String iscapitalorsmallordigit(String str) {
		char c= str.charAt(0);
		if(capital(c)) {
			return "Capital";
		}
		else if(small(c)) {
			return "Small";
		}
		else if(digit(c)) {
			return "Digit";
		}
		else if(special(c)) {
			return "Special Character";
		}
		else
			return "Wrong Input";

		
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
	App x = new App();
	System.out.println(x.iscapitalorsmallordigit(s));

}
}

