package com.vamshi.arrayprogramms;

public class First_Nonrepeatinginarray {
public static void firstnonrepeating(int[] myarray) {
	  int n = myarray.length;
      for (int i = 0; i < n; i++) 
      {
    	  int j;
            for( j=0;j<n;j++){
            
                if(i != j && myarray[i] == myarray[j])
                  break;
            }
            if (j == n)
            {
                // Print the ith element
                System.out.println("First non-repeating number is: " + myarray[i]);
                break;
            }
	}


}
public static void main(String[] args) {
	int[] input= {10,5,4,3,6,3,5};
	firstnonrepeating(input);
	
}
}