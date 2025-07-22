package com.Exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		
		
	   try{
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter numerator");
			int num=sc.nextInt();
			
			System.out.println("Enter denomenator");
			int den=sc.nextInt();
			
			int ans=num/den;
			
			System.out.println(ans);
			
		  }
//		
//		catch(ArithmeticException e)
//		{
//		   System.out.println("Dont divide by zero");	
//		}
//		
		  finally {
	
			  System.out.println("finally block execouted");
		  }

	}

}
