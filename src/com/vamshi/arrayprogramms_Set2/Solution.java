package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.vamshi.arrayprogramms.Removingduplicatesandchecking_length;

class Solution {
	  public String gcdOfStrings(String str1, String str2) {
	      String ans=null;  
		  if(str1.length()>str2.length()&&str1.contains(str2)) {
	        	Set<String>myset=new HashSet<>();
	        	for(int i=0;i<str1.length();i++) {
	        		for (int j = i + str2.length(); j <= str1.length(); j++) {
	                    String substring = str1.substring(i, j);
	                    if (substring.contains(str2)) {
	                        myset.add(substring);
	                    }
	        		}
	        		}
	         ans=myset.toString();
	        	}
	    
	  
	return ans;
	}
}