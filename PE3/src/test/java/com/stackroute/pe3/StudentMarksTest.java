package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.pe3.StudentMarks;

public class StudentMarksTest {
		
		StudentMarks pe = new StudentMarks();
		int stugrades1[]=new int[] {45,78,56,23,90};
		int stugrades[]=new int[] {34,56,78,90,123};
	
	//q1
	@Test
	public void teststuGrade()
	{
		assertEquals("Invalid-Grades",pe.checkStugrade(stugrades));
		assertEquals("Valid-Grades",pe.checkStugrade(stugrades1));
		assertNotEquals("Invalid-Grades",pe.checkStugrade(stugrades1));
	}

}
