package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Removingduplicatesandchecking_length {
public static int[] Removingdups(int[] dups) {
	int[] result=new int[dups.length];
	int previous=dups[0];
	result[0]=previous;
	
	for(int i=0;i<dups.length;i++) {
	int ch=dups[i];
	if(previous!=ch) {
		result[i]=ch;
		
	}
	previous=ch;
	}
	return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,2,2,3,4,5,6,3,9,6};
for(int result:myarray)
System.out.println(
		Arrays.toString(Removingdups(myarray)));
	}

}
