package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Arraypairs {
public static void arraypairs(int[] pairs) {
	if(pairs.length%2!=0) {
		return ;}else {
	
	for(int i=0;i<pairs.length;i++) {
		for(int j=0;j<pairs.length;j++) {
			if(j!=i) {
				System.out.println(pairs[i]+" "+pairs[j]);
			}
		}
	}}
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,10,5,6,7,8,9,50};
arraypairs(myarray);
	
}
	}


