package com.vamshi.arrayprogramms;
/*Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 
*/


public class Leetcode1512 {
	public static int numidenticalpairs(int[] pairs) {
		int val=0;
		for(int i=0;i<pairs.length-1;i++) {
			for(int j=i+1;j<pairs.length;j++) {
if(pairs[i]==pairs[j]) {
	val++;
}				
			}
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,1,1,1};
System.out.println(numidenticalpairs(myarray));
	}

}
