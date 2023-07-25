package com.apps.na.handson;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		int number, temp , total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
	    n = sc.nextInt();
	    number = n ;
	    while(number != 0)
	    {
	    	temp = number % 10;
	    	total = total + temp*temp*temp;
	    	number /=10;
	    }
	    if(total == n)
	    {
	    	System.out.println("The given number is amstrong number");
	    }
	    else {
	    	System.out.println("The given number is not amstrong number");
	    }


	}

}
