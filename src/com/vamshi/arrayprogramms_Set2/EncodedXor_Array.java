package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

/*1720. Decode XORed Array
Easy
1.4K
197
Companies
There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

 

Example 1:

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
Example 2:

Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]*/
public class EncodedXor_Array {
public static int[] myencodedXor(int[] myarray,int first) {
	int [] array=new int[myarray.length+1];
	array[0]=first;
	for(int i=0;i<myarray.length;i++) {
		array[i+1]=array[i]^myarray[i];
		
		
		
	}
	return array;
	
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] encoded= {1,2,3};
int[] ans=myencodedXor(encoded, 1);
System.out.println(Arrays.toString(ans));
	}

}
