package com.stackroute.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_5Test {

	@Test
	public void testsum() {
		Problem_5 x = new Problem_5();
		String s="2 3 4 d e";
		assertEquals(9, x.sum(s,5));
	}
	@Test
	public void testletter() {
		Problem_5 x = new Problem_5();
		String s="2 3 4 d e";
		assertEquals(1, x.letter(s,5));
	}
	

}
