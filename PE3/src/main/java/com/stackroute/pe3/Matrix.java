package com.stackroute.pe3;

public class Matrix {

	public int[][] sumMatrix(int m,int n, int[][] a, int[][] b)
	{
		int[][] arr = new int[3][2];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j< n; j++)
				arr[i][j] = a[i][j] + b[i][j];
		}
		return arr;
	}
}
