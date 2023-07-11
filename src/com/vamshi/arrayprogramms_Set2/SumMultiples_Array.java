package com.vamshi.arrayprogramms_Set2;

public class SumMultiples_Array {
public static int sumofmultiples(int multiple) {
	int sum=0;
	for(int j=1;j<=multiple;j++) {
	if(j%3==0||j%5==0||j%7==0) {
		sum+=j;
		
	}
	
	
	}
	
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans=sumofmultiples(10);
System.out.println(ans);
	}

}
