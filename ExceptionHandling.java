package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
	//Scanner sc=null;
		
	System.out.println("Enter Number");
	int num=sc.nextInt();
	
	System.out.println("Enter Denominetor");
	int den=sc.nextInt();
		
		try {	
			
			int ans=num/den;
			
			System.out.println(ans);
		}
		
		catch(ArithmeticException e)
		{
			 System.out.println("Dont divide number by zero");
		
	    }
	}

}
