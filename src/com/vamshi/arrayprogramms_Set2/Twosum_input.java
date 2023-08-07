package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;
/*167. Two Sum II - Input Array Is Sorted should return indices of array;*/

public class Twosum_input {
public static int[] inputarray(int[] myarray,int target) {
	int forword=0;
	int backward=myarray.length-1;
	int[] result=new int[2];
	while(forword<backward) {
		int sum=myarray[forword]+myarray[backward];
		if(sum==target) {
			result[0]=myarray[forword];
		result[1]=myarray[backward];
		break;
		}else if(sum<target) {
			forword++;
		}else {
			backward--;
		}
	}return result;
}
	public static void main(String[] args) {
int[] myarray= {2,7,11,15};
int target=9;
int[] ans=inputarray(myarray, target);
System.out.println(Arrays.toString(ans));
	}

}
