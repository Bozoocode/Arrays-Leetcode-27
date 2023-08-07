package com.vamshi.arrayprogramms_Set2;

import java.util.HashMap;
import java.util.HashSet;


public class Dups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] myarray = {1, 1, 3, 2, 4, 3, 4, 8, 7, 9, 5, 4, 5, 5, 6, 6, 8};

		        HashMap<Integer,Integer>unique=new HashMap<>();
		        
		        for(int i:myarray) {
		        	unique.put(i,unique.getOrDefault(i,0)+1);
		        }
		        for(int i:myarray) {
		        	int occurance=unique.get(i);
		        	if(occurance==1) {
		        		System.out.println(i);
		        	}
		        }
		        
		        
		        		    }
		}
	
		
	
