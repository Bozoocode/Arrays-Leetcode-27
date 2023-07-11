package com.vamshi.arrayprogramms;

import java.util.ArrayList;
import java.util.List;

public class ExtraCandies_array {
    public static List<Boolean> kidswithcandies(int[] candies, int extraCandies) {
        int greatest = candies[0];
        List<Boolean> mylist = new ArrayList<>();

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            boolean isGreatest = candies[i] + extraCandies >= greatest;
            mylist.add(isGreatest);
        }

        return mylist;
    }

    public static void main(String[] args) {
        int[] myarray = {4,2,1,1,2};
        List<Boolean> result = kidswithcandies(myarray, 1);
        System.out.println(result); 
    }
}
