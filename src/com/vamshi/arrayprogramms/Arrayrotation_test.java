package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Arrayrotation_test {
	public static void rotateArray(int[] arr, int k) {
	    int length = arr.length;
	    if(k==0||k%arr.length==0) {
	    	return;}
	    k = k % length; // Adjust the number of rotations if it exceeds the array length
	    // Rotate the array k times
	    for (int i = 0; i < k; i++) {
	        int lastElement = arr[0];

	        // Shift elements to the right
	        for (int j = 0; j < arr.length-1; j++) {
	            arr[j] = arr[j +1];

	        }

	        arr[arr.length-1] = lastElement; 
	    }
	}
public static void main(String[] args) {
	int[] myarray= {1,10,3,4,5,6,7,8};
	rotateArray(myarray, 3);
	System.out.println(Arrays.toString(myarray));
}

}
