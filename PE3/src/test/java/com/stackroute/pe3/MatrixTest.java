package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MatrixTest {

	Matrix ms=new Matrix();
	int[][] myArray1 = { {0,1}, {3,2}, {3,5} };
	int[][] myArray2=  { {2,1}, {1,2}, {4,2} };
	int[][] sum= {{2,2}, {4,4}, {7,7}};
	int[][] sum1= { {2,3},{4,5}, {6,7}};
	
	//q2
		@SuppressWarnings("deprecation")
		@Test
		public void testMatrixsum()
		{
		
	assertEquals(sum,ms.sumMatrix(3,2,myArray1,myArray2));
	assertNotEquals(sum1 ,ms.sumMatrix(3, 2, myArray1, myArray2));
		}
}

	
