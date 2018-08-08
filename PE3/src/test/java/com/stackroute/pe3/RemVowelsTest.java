package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class RemVowelsTest {

	RemVowels rv=new RemVowels();
	String[] str= {"India","UnitedStates","Germany","Egypt","czechoslovakia"};
	
	//q4
	
			@Test
			public void testVowels()
			{
				assertEquals("nd,ntdStts,Grmny,gypt,czchslvk",rv.noVowels(str));
				assertNotEquals("ind,ntedStates,Grmany,Egypt,czechslvk",rv.noVowels(str));
			}
		
}
