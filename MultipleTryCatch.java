package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
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
	

		catch(NullPointerException e)
		{
			 System.out.println("Dont call an object member with null ref ");
			 
		}
		
		catch(InputMismatchException e)
		{
			 System.out.println("Enter Valid input to the Scanner");
			 
		}
		

	}

}
