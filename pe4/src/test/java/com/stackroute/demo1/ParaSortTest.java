package com.stackroute.demo1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.Test;



import org.junit.BeforeClass;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ParaSortTest {
	public static ParaSort obj;
	@BeforeClass
	   public static void setup()
	   {
		   obj = new ParaSort();
	   }
	   @AfterClass
	   public static void teardown()
	   {
		   obj=null;
	   }
	   @Test
	   public void test()
	   {
		   String s="she sells seashells by the seashore";
		   String s2="by seashells seashore sells she the";
		   
		   assertEquals(s2,obj.fun(s));
		   assertNotEquals("she",obj.fun(s));
		   assertNotNull(obj.fun(s));
	   }

}
