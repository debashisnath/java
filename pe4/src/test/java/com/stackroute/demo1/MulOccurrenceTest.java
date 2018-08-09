package com.stackroute.demo1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.Test;



import org.junit.BeforeClass;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MulOccurrenceTest {
	public static MulOccurrence obj;
	@BeforeClass
	   public static void setup()
	   {
		   obj = new MulOccurrence();
	   }
	   @AfterClass
	   public static void teardown()
	   {
		   obj=null;
	   }
	   @Test
	   public void test() {
		   String s="She sells seashells by the seashore";
		   String s1="se";
		   assertEquals("4-6,10-12,27-29", obj.fun(s,s1));
		   assertNotEquals("1-2",obj.fun(s,s1));
		   assertNotNull(obj.fun(s,s1));
	   }
	
}
