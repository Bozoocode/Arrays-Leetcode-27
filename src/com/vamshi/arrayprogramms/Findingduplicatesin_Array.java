package com.vamshi.arrayprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Findingduplicatesin_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums={10,20,10,40,20};
List<Integer> ans=duplicatesin_array(nums);
System.out.println(ans);
	}
	public static List<Integer> duplicatesin_array(int[] nums) {
		List<Integer> mylist=new ArrayList<>();
		for(int nms:nums) {
			mylist.add(nms);
		}
				return mylist.stream().filter(t->Collections.frequency(mylist,  t)>1).distinct()
		.collect(Collectors.toList());
	
	}

}
