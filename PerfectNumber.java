package com.apps.na.handson;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=28;
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(number==sum) {
			System.out.println(number+" Perfect Number");
		}else {
			System.out.println(number+" Not Perfect Number");
		}

	}

}
