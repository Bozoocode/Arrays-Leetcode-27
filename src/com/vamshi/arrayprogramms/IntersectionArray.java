package com.vamshi.arrayprogramms;

public class IntersectionArray {
public static void intersectiontest(int[] i,int[] j) {
	for(int a=0;a<i.length;a++) {
		
	
for(int b=0;b<i.length;b++) {
if(i[a]==j[b]) {
	System.out.println(i[a]);
}		
	}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] first= {1,21,45,67,89};
int[] second= {1,21,65,67,99};
intersectiontest(first, second);
	}

}
