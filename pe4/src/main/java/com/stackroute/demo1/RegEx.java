package com.stackroute.demo1;

public class RegEx 
{

	public Boolean is_Harry_here(String s)
	{
		String[] str = s.split(" ");
		int flag = 0;
		for(int i = 0; i<str.length; i++) {
			if(str[i].equals("Harry"))
				flag = 1;
		}
		if(flag == 1)
			return true;
		else
		return false;
	}
}
