package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Findingkthsmallest {
public static int findingk(int[] myarray ,int k) {
	for(int i=0;i<myarray.length;i++) {
		Arrays.sort(myarray);
		
	}
	return myarray[k-1];

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,3,4,5,7,9,0};
int k=4;
System.out.println(findingk(myarray, k));

	}

}
