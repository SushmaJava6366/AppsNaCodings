package com.apps.na.handson;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=24;
		for(int i=2;i<num;i++) {
			while(num%i==0) {
				System.out.println(i+" ");
				num=num/i;
			}
		}
		if(num>2) {
			System.out.println(num);
		}

	}

}
