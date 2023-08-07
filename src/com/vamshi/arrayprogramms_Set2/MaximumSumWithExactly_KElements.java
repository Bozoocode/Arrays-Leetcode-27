package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class MaximumSumWithExactly_KElements {
	public static int maximumsize(int[] nums,int k) {
		Arrays.sort(nums);
		int pivot=nums.length-1;
int result=nums[pivot];
int ans=result;
		for(int j=1;j<k;j++) {
ans+=result+j;
			}
	return ans;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {5,5,5};
int k=2;
System.out.println(maximumsize(myarray, k));
	}

}
