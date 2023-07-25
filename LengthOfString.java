package com.apps.na.handson;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string ="stringlength";
		int i=0;
		for(char ch : string.toCharArray()) {
			i++;
		}
		System.out.println("the length of the string is : "+i);
	}

}
