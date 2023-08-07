package com.vamshi.arrayprogramms_Set2;

public class CountNumberofPairsWithAbsoluteDifference_K {
	
public static int countKDifference(int[] nums, int k) {
	 int count = 0;
     for (int i = 0; i < nums.length - 1; i++) {
         for (int j = i + 1; j < nums.length; j++) {
             if (Math.abs(nums[i] - nums[j]) == k) {
                 count++;
             }
         }
     }
     return count;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,3};
int count=3;
System.out.println(countKDifference(myarray, count));
	}

}
