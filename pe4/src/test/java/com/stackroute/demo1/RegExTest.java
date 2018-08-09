package com.stackroute.demo1;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.Test;

public class RegExTest {
	public static RegEx re;
	
	@BeforeClass
	public static void setup() {
		re=new RegEx();
	}
	@AfterClass
	public static void teardown() {
		re=null;
	}
   @Test
   public void test() {
	   String s="This is Harry";
	   String s1="This is Henry";
	   assertEquals(true,re.is_Harry_here(s));
	   assertEquals(false,re.is_Harry_here(s1));
	   assertNotEquals(false,re.is_Harry_here(s));
   }
	
	
	
}
