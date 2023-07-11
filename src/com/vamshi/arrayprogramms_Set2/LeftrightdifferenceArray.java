package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class LeftrightdifferenceArray {
public static int[] leftrightdifference(int[] myarray) {
	int length=myarray.length;
	int[] ans=new int[length];
	int[] rightindex=new int[length];
	int[] leftindex=new int[length];
	
	for(int i=1;i<length;i++) {
		leftindex[i]=leftindex[i-1]+
				myarray[i-1];
	}
	for(int i=length-2;i>=0;i--) {
		rightindex[i]=rightindex[i+1]+
				myarray[i+1];
		System.out.println(rightindex[i]);
		}
	for(int i=0;i<length;i++) {
		ans[i]=Math.abs(leftindex[i]-rightindex[i]);
	}
	
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,2,3,4};
int[] ans=leftrightdifference(myarray);
System.out.println(Arrays.toString(ans));
	}

}
