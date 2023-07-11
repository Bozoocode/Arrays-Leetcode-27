package com.vamshi.arrayprogramms;
//formula for sum of numbers=(n*(n+1))/2;
public class Findingmissingnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] teeth= {1,2,3,4,5,7};
		System.out.println(missingnumber(teeth));
	}
public static int missingnumber(int[] nums) {
	int m=nums.length+1;
	int formulasum=(m*(m+1))/2;
	for(int num:nums) {
		formulasum-=num;
	
	}
	
	return formulasum;
	
	
}
}
