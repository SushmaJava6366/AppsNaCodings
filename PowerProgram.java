package com.apps.na.handson;

public class PowerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int base = 3, power = 3;
        int result = 1;
        while (power != 0) {
            result = result * base;
	    power--;
        }
        System.out.println("Result =  " + result);
	}

}
