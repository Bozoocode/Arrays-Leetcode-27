package com.vamshi.arrayprogramms;

public class DividingArray_intopairs {
	public static int[][] pairdivision(int[] pair) {
		if(pair.length%2!=0) {
			throw new IllegalArgumentException("arrays length should be even"); 
		}
		int[] [] mypaireset=new int[pair.length%2][2];
		for(int i=0;i<pair.length-1;i+=2 ) {
		mypaireset[i/2][0]=pair[i];
		mypaireset[i/2][1]=pair[i];
		}
		return mypaireset;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        if (myArray.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        int[][] pairs =pairdivision(myArray);
        for(int [] j:pairs) {
        	System.out.println(j);
        }

	}

}
