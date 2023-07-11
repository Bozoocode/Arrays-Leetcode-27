package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Arrayrotationfrom_end {
public static int[] myarrayrotator(int[] myarray ) {
	int K=2;
	int[] ans=new int[myarray.length];
	int m=0;
	for(int i=K;i<myarray.length;i++) {
		ans[m]=myarray[i];
		m++;
		
	}
	for(int i=0;i<K;i++) {
		ans[m]=myarray[i];
		m++;
		
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray={1,10,90,6,7,8,9,20};
int[] solution=myarrayrotator(myarray);
System.out.println(Arrays.toString(solution));
	}

}
