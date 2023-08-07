package com.vamshi.arrayprogramms_Set2;

public class RemoveDuplicatesfromSortedArray {
	public static  int removeduplicagtes(int[] myarray) {
		int count=1;
		for(int i=1;i<myarray.length;i++) {
			if(myarray[i]!=myarray[i-1]) {
				myarray[count]=myarray[i];
				count++;
			}
		}return count;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {0,0,1,2,3,4,4,5};
System.out.println(removeduplicagtes(myarray));
	}

}
