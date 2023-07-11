package com.vamshi.arrayprogramms;



public class FindingFirstRepeatingElement {
    public static int printFirstRepeatingElement(int[] array) {
        for(int i=0;i<array.length;i++) {
        for(int j=0;j<array.length;j++) {
        	if(array[i]==array[j]) {
        		return array[i];
        	}
        }	
        }          return -1;  
        }

    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 3, 5, 6};
        
        System.out.println(printFirstRepeatingElement(array));
    }
}
