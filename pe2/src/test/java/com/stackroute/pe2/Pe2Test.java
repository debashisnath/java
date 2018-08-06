package com.stackroute.pe2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;



public class Pe2Test {
	private static Pe2 pe2;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		pe2 = new Pe2();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		pe2 = null;

	}

    @Test
	public void testdoRev()
	{
		assertEquals(true,pe2.doRev(12321));
		assertTrue(pe2.doRev(121));
		assertFalse(pe2.doRev(7896));
	}
    @Test
	public void testpowFour()
	{
		assertTrue(pe2.powFour(64));
		assertFalse(pe2.powFour(0));
		//assertNull(pe2.powFour(0));
	}
    
	@Test
	public void testclassMem()
	{
    	Pe21 x = new Pe21("HarryPotter", 30, 2500.3);
		assertEquals("HarryPotter",x.getName());
		assertEquals(30,x.getAge());
		assertEquals(2500.3,x.getSal(),0.0);
	}
}
