package com.apps.na.handson;

import java.util.Arrays;

public class TwoArraysEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 5, 4 };
		int arr2[] = { 5, 4, 2, 1 };
		if (arr1.length == arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		    boolean result = Arrays.equals(arr1, arr2);
			if (result) {

				System.out.println("arrays are equal");

			} else {
				System.out.println("arrays are not equal");
			}

		}
	}

}
