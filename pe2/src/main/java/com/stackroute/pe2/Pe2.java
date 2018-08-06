package com.stackroute.pe2;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pe21{
	String name;
	int age;
	double sal;
	public Pe21(String string, int i, double d) {
		setName(string);
		setAge(i);
		setSal(d);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}

public class Pe2 {
	
	public boolean doRev(int num)
	{
		
		int reverse = 0, p = 0;
		int x = num;
		while(x!=0) {
			reverse = reverse*10 + x%10;
			x = x/10;
		}
		if(reverse == num) {
		int y = reverse;
		while(reverse!=0) {
			p = p*10 + reverse%10;
			reverse = reverse/10;
		}
		if(p == num) {
			return true;
		}
		else
		return false;}
		else
			return false;
	}
	public boolean powFour(int n)
	{
		
	if(n == 0)
	return false;
	while(n != 1)
	{    
	 if(n % 4 != 0)
	 return false;
	 n = n / 4;      
	 }
	return true;
			
	}
	
	
	
	
}
