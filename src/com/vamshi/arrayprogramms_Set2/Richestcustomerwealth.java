package com.vamshi.arrayprogramms_Set2;

public class Richestcustomerwealth {
public static int maximumwealth(int[][] mywealth) {
	int maximumwealth = 0;	
	int temp = 0;

	for(int i=0;i<mywealth.length;i++) {
		
		
		
		
		
		for(int j=0;j<mywealth[i].length;j++) {
	
		maximumwealth+=mywealth[i][j];
	}
		if(maximumwealth>temp) {
			temp=maximumwealth;
		}
		maximumwealth=0;
	}			return temp;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] myarray= {{1,2,3},{3,2,1}};

System.out.println(maximumwealth(myarray));
	}

}
