package com.stackroute.pe3;

public class StudentMarks {
	
	public String checkStugrade(int[] nums) {
	
		for(int i = 0; i< nums.length; i++) {
			try {
			if(nums[i]<0 || nums[i]>100)
				throw new Exception("Invalid-Grades");
			}
			catch(Exception e){
				return e.getMessage();
			}
		}
		
			return "Valid-Grades";
	}

}
