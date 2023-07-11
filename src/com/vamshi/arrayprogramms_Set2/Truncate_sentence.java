package com.vamshi.arrayprogramms_Set2;

import java.util.Arrays;

public class Truncate_sentence {
public static String deletewords(String str ,int k) {
	
 String[] query=str.split(" ");
 String[] ans=new String[k];
	for(int i=0;i<k;i++) {
		for(int j=0;j<query.length;j++) {
		ans[i]=query[i];
	}
	}
	String answer=String.join(" ", ans);
	return answer;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Hello how are you Contestant"; int k = 4;
System.out.println(deletewords(str, k));
	}

}
