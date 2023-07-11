package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class Runningsumof1d_array {
	public static int[] runningarray(int[] myarray) {
		int ans[]= new int[myarray.length];
		ans[0]=myarray[0];
		for(int i=1;i<myarray.length;i++) {
			ans[i]=ans[i-1]+myarray[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,2,3,4};
int[] solution=runningarray(myarray);
		System.out.println(Arrays.toString(solution));
	}

}
