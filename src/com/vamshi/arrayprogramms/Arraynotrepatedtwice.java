package com.vamshi.arrayprogramms;

public class Arraynotrepatedtwice {
    public static void repeateduniquedfind(int[] myarray) {
        for (int i = 0; i < myarray.length; i++) {
            int count = 0;
            for (int j = 0; j < myarray.length; j++) {
                if (myarray[i] == myarray[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(myarray[i]);
                break; // Assuming there is only one unique number
            }
        }
    }

    public static void main(String[] args) {
        int[] myarray = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        repeateduniquedfind(myarray);
    }
}
