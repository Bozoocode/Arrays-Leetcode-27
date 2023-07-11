package com.vamshi.arrayprogramms_Set2;

public class DifferencebetweenElementsumand_digitsum {
public static int differemcesum(int[] marray) {
	int numbersum=0;
	int digitsum=0;
	int temp=0;
	for(int i=0;i<marray.length;i++) {
		numbersum+=marray[i];
		while(marray[i]!=0) {
			int digit=marray[i]%10;
			temp+=digit;
			marray[i]/=10;
			

		}
		
		
	}
	digitsum+=temp;
	System.out.println(digitsum);
	return numbersum-digitsum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarry= {1,15,6,3};
System.out.println(differemcesum(myarry));
	}

}
