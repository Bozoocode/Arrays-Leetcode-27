package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Targetnumberinrotated_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] rotating= {1,2,3,4,5};
int targ=3;
int[] ans=rotator(rotating, targ);
	System.out.println(Arrays.toString(ans));
}
	
	public static int[] rotator(int[] rotating,int target) {
		int[] rotates=new int[rotating.length];
		for(int i=0;i<rotating.length;i++) {
			int newindex=(i+target)%rotating.length;
			rotates[newindex]=rotating[i];
		}
		return rotates;
	}

}
