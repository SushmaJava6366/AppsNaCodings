package com.apps.na.handson;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" sa n thosh";
		String s="";
		
		Scanner sc = new Scanner(str);
		while(sc.hasNext()) {
			s+=sc.next();
		}
		System.out.println(s);
	}

}
