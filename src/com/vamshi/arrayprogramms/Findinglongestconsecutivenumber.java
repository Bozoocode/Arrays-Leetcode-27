package com.vamshi.arrayprogramms;

public class Findinglongestconsecutivenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,40,50};
int longest = 1;
int present = 1;
for(int i=1;i<arr.length;i++) {
if(arr[i]==arr[i-1]+1) {
	
	
	present++;}
		else{present=1;}
	
	

if(present>longest) {
	longest=present;
	
}
}

System.out.println(longest);
	}

}
