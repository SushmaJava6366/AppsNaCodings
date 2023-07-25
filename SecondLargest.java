package com.apps.na.handson;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 2, 5, 6 , 10  };
		Arrays.sort(arr);
		int sh = arr[arr.length-2];
		System.out.println(sh);
	}

}
