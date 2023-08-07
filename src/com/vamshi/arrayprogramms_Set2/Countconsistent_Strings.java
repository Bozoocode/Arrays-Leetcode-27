package com.vamshi.arrayprogramms_Set2;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;

public class Countconsistent_Strings {

    public static int countConsistency(String allowed, String[] myarray) {
        int count = 0;
        HashSet<Character> mystring = new HashSet<Character>();
        
        // Add allowed characters to the set
        for (int i = 0; i < allowed.length(); i++) {
            mystring.add(allowed.charAt(i));
        }

        for (String s : myarray) {
            boolean isConsistent = true;

            // Check each character in the string 's'
            for (int j = 0; j < s.length(); j++) {
                if (!mystring.contains(s.charAt(j))) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] myarray = {"ad", "bd", "aaab", "baa", "badab"};
        String allowed = "ab";
        System.out.println(countConsistency(allowed, myarray)); // Output: 4
    }
}
