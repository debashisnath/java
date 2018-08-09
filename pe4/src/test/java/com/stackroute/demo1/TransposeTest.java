package com.stackroute.demo1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;



public class TransposeTest {
public static Transpose t;
@BeforeClass
public static void setup()
{
	   t = new  Transpose();
}
@AfterClass
public static void teardown()
{
	   t=null;
}
@Test
public void test() {
	String str="a quick brown fox jumps over the lazy dog";
	assertEquals("a kciuq nworb xof spmuj revo eht yzal god",t.check(str));
	assertNotEquals("quicks",t.check(str));
	assertNotNull(t.check(str));
	
}
}
