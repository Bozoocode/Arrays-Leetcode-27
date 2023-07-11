package com.vamshi.arrayprogramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_removingspecficnumber {
    public static int[] removenumberinarray(int[] myarray, int k) {
        List<Integer> mylist = new ArrayList<>();
        
        // Convert array to ArrayList
        for (int element : myarray) {
            mylist.add(element);
        }
        
        // Remove specific number from ArrayList
        mylist.remove(Integer.valueOf(k));
        
        // Convert ArrayList back to array
        int[] newArray = new int[mylist.size()];
        for (int i = 0; i < mylist.size(); i++) {
            newArray[i] = mylist.get(i);
        }
        
        return newArray;
    }

    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4, 5};
        int k = 3;
        
        int[] result = removenumberinarray(myarray, k);
        System.out.println(Arrays.toString(result));
    }
}
