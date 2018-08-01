package com.stackroute.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Problem_6Test {

	@Test
	public void testiscapitalorsmallordigit() {
		
		Problem_6 problem = new Problem_6();
		String s=  problem.iscapitalorsmallordigit("a");
		assertEquals("Small",s);
		//assertEquals("Small Letter", problem.iscapitalorsmallordigit("a"));
	}

}
