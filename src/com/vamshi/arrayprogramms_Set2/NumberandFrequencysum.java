package com.vamshi.arrayprogramms_Set2;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberandFrequencysum {
public static int[] numberfrequency(int[] myarray) {
	int freq=0;
	int val=0;
	ArrayList< Integer> al=new ArrayList<>();
	
	for(int i=0;i<myarray.length-1;i+=2) {
	 freq=myarray[i];
		 val=myarray[i+1];
		for(int j=0;j<freq;j++) {
			al.add(val);
		}
		
	}
	int[] myans=new int[al.size()];
	for(int i=0;i<al.size();i++) {
		myans[i]=al.get(i);
	}
	return myans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,1,2,3};
int[] myans=numberfrequency(myarray);
System.out.println(Arrays.toString(myans));
	}

}
