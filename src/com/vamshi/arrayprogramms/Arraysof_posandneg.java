package com.vamshi.arrayprogramms;

import java.util.Arrays;

public class Arraysof_posandneg {
    public static int[] negpos(int[] nums) {
        int[] ans = new int[nums.length ];

        int positive = 1, negative = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < 0) {
                ans[negative] = nums[i];
                negative += 2;
            } else {
                {
                    ans[positive] = nums[i ];
                    positive += 2;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] myArray = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int[] resultArray = negpos(myArray);

        System.out.println(Arrays.toString(resultArray));
    }
}
