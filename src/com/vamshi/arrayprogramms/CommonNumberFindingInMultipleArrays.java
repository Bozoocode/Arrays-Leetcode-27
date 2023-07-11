package com.vamshi.arrayprogramms;

public class CommonNumberFindingInMultipleArrays {
    public static void findCommonNumbers(int[] set1, int[] set2, int[] set3) {
        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if (set1[i] == set2[j]) {
                    int commonElement = set1[i];
                    for (int k = 0; k < set3.length; k++) {
                        if (set3[k] == commonElement) {
                            System.out.println(commonElement);
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] input1 = {1, 5, 10, 20, 40, 80};
        int[] input2 = {6, 7, 20, 80, 100};
        int[] input3 = {3, 4, 15, 20, 30, 70, 80, 120};
        findCommonNumbers(input1, input2, input3);
    }
}
