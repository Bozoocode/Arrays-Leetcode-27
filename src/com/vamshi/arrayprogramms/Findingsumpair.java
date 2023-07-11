package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Findingsumpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int target=10;
int[] sum= {10,-2,5,6,8,9,20,-10};
 printarrays(sum, target);


	}
	public static void printarrays(int[] myvals, int target) {
		for(int i=0;i<myvals.length;i++) {
			int first=myvals[i];
		
		for(int j=0;j<myvals.length;j++) {
			int second=myvals[j];
		
		if((first+second)==target) {
			System.out.println("%d+"+first +" "+second);}
		
		}
		}
		}
	}


