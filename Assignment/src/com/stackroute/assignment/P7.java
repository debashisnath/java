package com.stackroute.assignment;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		String myStr =Integer.toString(num);
		int size = myStr.length();
		
		
		int temp,rem,add = 0;
		int[] arr = new int[size];
		temp = num;
	    int i=0;
		while(temp>0) {
			rem = temp%10;
			arr[i]= rem;
			temp = temp/10;
			i++;
		}
		for(int k = 0;k<size;k++) {
			for(int j=k+1; j<size; j++) {
				if(arr[k]<arr[j]) {
					int t=arr[k];
					arr[k]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("Sorted number in non-increasing order:");
		for(int j=0;j<arr.length;j++) {
			
			System.out.print(arr[j]);
		}
		int temp1=num;
		while(temp1>0) {
			 int y=temp1%10;
			 if(y%2==0) {
				 
				add= add+y;
				 
			 }
			 temp1=temp1/10;
	
		}
		System.out.println();
		System.out.println("Sum of even numbers :");
		System.out.println(add);
		if(add>15) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		scanner.close();
	}
}
