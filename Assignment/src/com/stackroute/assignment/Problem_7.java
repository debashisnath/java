package com.stackroute.assignment;

import java.util.Scanner;

public class Problem_7 {
public static void main(String []args) {
	int x,r ;
	System.out.println("Enter value");
	Scanner input= new Scanner(System.in);
	x= input.nextInt();
	String s=Integer.toString(x);
	
	//System.out.println(s.length());
//	String[] integerStrings = s.split(" "); 
//	int[] integers = new int[integerStrings.length]; 
//	for (int i = 0; i < integers.length; i++){
//	integers[i] = Integer.parseInt(integerStrings[i]); 

	//}
	
	int temp=x;
	int y= s.length();
	//System.out.println(y);
	int[] arr=new int[y];
//	for(int i=0; i<y; i++) {
	int i=0;
		while(temp>0) {
			
			r=temp%10;
			arr[i]=r;
		System.out.println(arr[i]);
			temp=temp/10;
			i++;
		}
	//}
		int j=0;
	while(y>0) {
		
		System.out.println(arr[j]);
		j++;
		y--;
	}
//	for(int i = 0;i<y;i++) {
//		for(int j=i+1; j<y; j++) {
//			if(arr[i]<arr[j]) {
//				int t=arr[i];
//				arr[i]=arr[j];
//				arr[j]=t;
//			}
//		}
//	}
//	for(int i=0;i<y;i++) {
//		System.out.println(arr[i]);
//	}
	input.close();
}
}
