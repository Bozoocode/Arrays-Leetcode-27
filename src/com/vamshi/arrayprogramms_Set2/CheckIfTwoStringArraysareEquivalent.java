package com.vamshi.arrayprogramms_Set2;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTwoStringArraysareEquivalent {
public static boolean checkstring(String[] word1, String[] word2) {
	boolean ans = false;
String st1=String.join(" ", word1);
st1=st1.replaceAll("\\s", "");

String st2=String.join(" ", word2);
st2=st2.replaceAll("\\s", "");
if(st1.equals(st2)) {
 ans= true;
}else {
	ans= false;


}
return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] word1= {"ab", "c"};
String[] word2= {"abcd"};
System.out.print(checkstring(word1, word2));

	}

}
