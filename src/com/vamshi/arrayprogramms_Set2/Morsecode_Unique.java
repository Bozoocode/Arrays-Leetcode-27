package com.vamshi.arrayprogramms_Set2;
import java.util.HashSet;

class Morsecode_Unique {
    private static String transform(String str) {
        String s[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
    "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."},res="";
        for(int i=0;i<str.length();i++)
            res+=s[(int)str.charAt(i)-'a'];
        return res;
    }
    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet<String>();
        for(String w : words) {
            set.add(transform(w));
        }
        return set.size();
    }
    public static void main(String[] args) {
		String[] myarray= {"gin","zen","gig","msg"};
		System.out.println(uniqueMorseRepresentations(myarray));
	}
}