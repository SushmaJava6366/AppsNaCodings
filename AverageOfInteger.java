package com.apps.na.handson;

public class AverageOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];

		}

		float avg = sum / 10;
		System.out.println("Average of 10 numbers are :");
		System.out.println(avg + " %");
	}

}
