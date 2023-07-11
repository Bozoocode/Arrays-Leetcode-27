package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Deletingduplicateswithoutcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] dup= {10,20,30,50,20,10};
int[] result = deletingdups(dup);

System.out.println("Array after removing duplicates:");
for (int num : result) {
    if (num != 0) {
        System.out.print(num + " ");
   
	}}}
	public static int[] deletingdups(int[] dup) {
		int head;

		Arrays.sort(dup);
		int[]result=new int[dup.length];
		int previous=dup[0];
		result[0]=previous;
		for(int i=0;i<dup.length;i++) {
			head=dup[i];
		if(previous!=head) {
			result[i]=head;
			
		}previous=head;

			
}			
		return result;	
	};}


