package com.vamshi.arrayprogramms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Deletingduplicatesn_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10,20,30,20,30};
	removingduplicates(nums);

	}
public static void removingduplicates(int[] finddups) {
	Set< Integer> q1=new HashSet();
for(int num:finddups) {
q1.add(num);	
}	
System.out.println(q1);
}
}