package com.vamshi.arrayprogramms;

import java.util.Arrays;

class Solution {
    public  static int[] twoSum(int[] nums, int target) {
    	int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
result[0]=i;
result[1]=j;

                }

        }
        
    }
        return result;
}
    public static void main(String[] args) {
		int[] myarray= {1,2,3,5,7,9,};
		int target=6;
		int[] myans=twoSum(myarray, target);
			System.out.println(Arrays.toString(myans));
	}
    }