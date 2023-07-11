package com.vamshi.arrayprogramms_Set2;


public class Shuffle_String {
	public static String stringshuffle(String name,int[] myarray) {
		
		    StringBuilder str = new StringBuilder("");
		    str.setLength(name.length());
		    for(int i=0;i<myarray.length;i++){
		       str.setCharAt(myarray[i], name.charAt(i));
		    }
		    return str.toString();
		}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray={4,5,6,7,0,2,1,3};
System.out.println(stringshuffle("codeleet", myarray));
		
	}

}
