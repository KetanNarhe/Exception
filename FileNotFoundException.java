package com.Exception;

import java.io.FileInputStream;

public class FileNotFoundException {           
                                                                           
	public static void main(String[] args) {
		
		try {    
			                                       
			FileInputStream fs=new FileInputStream("ketan.txt");
		                                     
		    }  
		   catch(Exception e)
		{
		  System.out.println(e); 
		}                                                
		  System.out.println("hello");                    
		

	}

}
