package com.apps.na.handson;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.print("Enter an year :: ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if(((year%400==0)||(year%4==0) && (year%100!=0)))
		{
			System.out.println("Leap year");
		}
		else {	
			System.out.print("Not a Leap year");
		}

	}

}
