package com.vamshi.arrayprogramms;

public class Firsttopnumbers_array {
public static void topnumberswthoutsort(int[] myarray) {
	int first=Integer.MIN_VALUE;int second=Integer.MIN_VALUE;
for(int i=0;i<myarray.length;i++) {
	if(myarray[i]>=first) {
		second=first;
		first=myarray[i];
		
	
}	
	}
System.out.println("My answer:"+first+" "+second);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray={1, 3, 6, 10, 11, 15};
topnumberswthoutsort(myarray);

	}

}
