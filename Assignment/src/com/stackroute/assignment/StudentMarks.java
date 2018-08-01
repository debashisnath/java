package com.stackroute.assignment;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String []arg) {
		int  numOfStudents;
		int[] stuGrades;
		System.out.println("Enter the number of students:");
		Scanner input= new Scanner(System.in);
		numOfStudents= input.nextInt();
		stuGrades= new int[numOfStudents];
		//System.out.println("Enter the grades for the students");
		for(int counter=0; counter<numOfStudents; counter++) {
			System.out.println("Enter the grade of student:"+(counter+1));
			stuGrades[counter]= input.nextInt();
			
		}
		for(int counter=0; counter<numOfStudents; counter++) {
			if(stuGrades[counter]<0 || stuGrades[counter]>100)
			{
				System.out.println("Grading Error found at Student:"+(counter+1));
			}
			
		}
		input.close();
	}
}
