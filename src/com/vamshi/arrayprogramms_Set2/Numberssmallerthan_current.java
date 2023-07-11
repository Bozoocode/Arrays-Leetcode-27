package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class Numberssmallerthan_current {
public static int[] smallernumbersthancurrent(int[] nums) {
	int[] myarray=new int[nums.length];
	for(int i=0;i<nums.length;i++) {
		int count=0;

		int target =nums[i];	
		for(int j=0;j<nums.length;j++) {
		
if(nums[j]<target &&nums[i]!=nums[j]) {
	count++;
}
		}
	
		myarray[i]=count;
		
		
		}
	
return	myarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,5,4,8};
		int[] ans=smallernumbersthancurrent(nums);
		System.out.println(Arrays.toString(ans));

	}

}
