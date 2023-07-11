package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.vamshi.arrayprogramms.Removingduplicatesandchecking_length;

class Solution {
    	public static int[] rotate(int[] nums, int k) {
            int [] ans=new int[nums.length];
            int index=0;
            for(int i=k;i<nums.length;i++){
            	ans[index]=nums[i];
            	index++;
            	                
            }for(int i=0;i<k;i++) {
            ans[index]=nums[i];
            index++;
            }
            return ans;
           }
    public static void main(String[] args) {
		int[] myarray= {1,2,2,3,3};
		int[] ans=rotate(myarray, 3);
	System.out.println(  Arrays.toString( ans));
    }
}