package com.vamshi.arrayprogramms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Findingmultipleduplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {10,20,30,20,30};
findingmultipledup(nums);
	}
	public static void findingmultipledup(int[] unique) {
		Set< Integer> q1=new HashSet();
		Set<Integer>q2=new HashSet<>();
		Map<Integer,Integer> count=new HashMap<>();
		

		for(int nums:unique) {
			
	
			if(!q1.add(nums)) {
				
			q2.add(nums);
			count.put(nums,count.getOrDefault(nums, 0)+1);
			}
				
			}
		for (int ans : q2) {
			int countr=count.get(ans);
			System.out.println(ans+"----"+countr);
			
		}
		}
	}


