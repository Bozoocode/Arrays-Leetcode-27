package com.vamshi.arrayprogramms_Set2;

public class StringarrayMaximumnumberofwords {
    public static int Myarrayformax(String[] myarray) {
        int maxCount = 0;
        for (String st : myarray) {
            String[] myans = st.split(" ");
            int count = myans.length;
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String[] myarray = {"please wait", "continue to fight", "continue to win"};
        int maxWordCount = Myarrayformax(myarray);
        System.out.println("Maximum number of words: " + maxWordCount);
    }
}
