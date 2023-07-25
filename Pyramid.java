package com.apps.na.handson;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		for(int i=0 ; i<n;i++)     
		{
			for(int j=n-i;j>1;j--)   
			{
				System.out.print(" ");   
			}
			for(int j=0;j<=i;j++)        
			{
				System.out.print("* " );    
			}
			System.out.println();  
		}
		
	}

}
