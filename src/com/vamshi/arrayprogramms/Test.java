package com.vamshi.arrayprogramms;

class test{
	public static void myarray(int n,int[] A,int[] B) {
	 A=new int[n];
	 B=new int[n];
	for(int i=0;i<A.length;i++) {
		for(int j=1;j<i;j++) {
			if(A[i]!=B[j]) {
				System.out.println(A[i]);
				
			}
			
			
	
	}
		}
	
	}
	public static void main(String[] args) {
		int[]A= {1,2,3,4,5};
		int[]B= {1,3,4,5,6};
		myarray(5, A, B);
		
	}
	
}
