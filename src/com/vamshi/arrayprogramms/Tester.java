package com.vamshi.arrayprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static int[] removeNumberFromArray(int[] arr) {
      ArrayList< Integer> mysol=new ArrayList<>();
    	  int[] sol=new int[arr.length/2];
    		   for(int i=0;i<arr.length;i++) {
    			   
    			for(int j=0;j<arr.length;j++) {
    				mysol.add(arr[i],arr[j]);
    			}	   
    			
    			   }
    			  
    			  for(int k=0;k<mysol.size();k++) {
    				  sol[k]=mysol.get(k);
    			  } 
    			   
    		   
    	   
    	return sol;
       }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 2, 4, 5, 4, 6, 7, 6};
        int[] newArray = removeNumberFromArray(myArray);
        System.out.println(Arrays.toString(newArray)); // Output: [1, 3, 4, 5, 4, 6, 7, 6]
    }
}
