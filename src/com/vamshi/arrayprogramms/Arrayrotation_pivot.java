package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Arrayrotation_pivot {
	public static int[] rotationofarray(int[] myarray) {
		int [] mysolution=new int[myarray.length];
	int	pivot=myarray.length/2;
	int m=0;
	for(int i=pivot;i<myarray.length;i++) {
		

		mysolution[m]=myarray[i];
		m++;
	}
	for(int i=0;i<pivot;i++) {
		mysolution[m]=myarray[i];
		m++;
	}
	return mysolution;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,20,40,2,5,6,8,9,10};
int[] solution=rotationofarray(myarray);
System.out.println(Arrays.toString(solution));
	}

}
