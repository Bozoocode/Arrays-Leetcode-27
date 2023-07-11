package com.vamshi.arrayprogramms;

public class Incrementdecrementby_Arrayinputs {
	public static void arrayincredecre(String[] arrayincrdecr) {
		int initalvalue=0;
		
			for(String operation:arrayincrdecr) {
				if(operation.equals("X++")||operation.equals("++X")) {
					initalvalue++;
				}else if (operation.equals("--X")||operation.equals("X--")) {
					initalvalue--;
					
				}
			
		}
			System.out.println(initalvalue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] operations = {"--X","X++","X++"};
arrayincredecre(operations);

	}

}
