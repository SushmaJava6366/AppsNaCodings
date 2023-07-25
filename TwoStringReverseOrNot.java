package com.apps.na.handson;

public class TwoStringReverseOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString="1234";
		firstString=firstString.toLowerCase();
		String string="";
		String secondString = "4321";
		secondString=secondString.toLowerCase();
		
		for(int i=firstString.length()-1;i>=0;i--) {
			string = string+firstString.charAt(i);
			
		}
		
		if(string.equals(secondString)) {
			System.out.println("The given string is reverse of other string");
		}else {
			System.out.println("The given string is not reverse of other string");
		}
	}

}
