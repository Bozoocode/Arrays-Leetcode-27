package com.vamshi.arrayprogramms_Set2;

public class Test {
static int count=0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
String s="vamshi";
int leng=s.length();
char[] myarray=new char[256];
for(int i=0;i<leng;i++) {
myarray[(int)s.charAt(i)]++;
}
for(int j=0;j<256;j++) {
	if(myarray[j]!=0) {
		System.out.println((char)j+ " "+ "occurance" + " "+(int)myarray[j]);
	}
}
			
		}
	

	

	}


