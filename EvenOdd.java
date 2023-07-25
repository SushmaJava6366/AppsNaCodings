package com.apps.na.handson;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Even numbers are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("odd numbers are:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
