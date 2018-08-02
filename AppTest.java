package com.stackroute.test;

//import static org.junit.Assert.assertEquals;



//import junit.framework.Test;
import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	public void testiscapitalorsmallordigit() {
		
		App problem = new App();
		String s=  problem.iscapitalorsmallordigit("a");
		assertEquals("Small",s);
		assertEquals("Capital", problem.iscapitalorsmallordigit("A"));
		assertEquals("Digit", problem.iscapitalorsmallordigit("1"));
		assertEquals("Special Character", problem.iscapitalorsmallordigit("@"));
	
	}
	
   public void testcapital() {
	   App x= new App();
	   assertTrue(x.capital('A'));
   }
   public void testsmall() {
	   App x= new App();
	   assertTrue(x.small('a'));
   }
   public void testdigit() {
	   App x= new App();
	   assertTrue(x.digit('1'));
   }
   public void testspecial() {
	   App x= new App();
	   assertTrue(x.special('@'));
   }
}
