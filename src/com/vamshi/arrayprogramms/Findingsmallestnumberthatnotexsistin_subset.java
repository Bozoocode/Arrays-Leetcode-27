package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Findingsmallestnumberthatnotexsistin_subset {
public static int subsetpost(int[] myarray) {
	int smallest=1;
	Arrays.sort(myarray);
	for(int i=0;i<myarray.length;i++) {
		if(myarray[i]>smallest) {
			return smallest;
		}else {
		smallest+=myarray[i];
		}
	}
	return smallest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 3, 4, 5};
		System.out.println(subsetpost(arr1));
	}

}
