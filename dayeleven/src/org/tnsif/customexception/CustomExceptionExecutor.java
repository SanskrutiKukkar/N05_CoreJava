package org.tnsif.customexception;

import java.util.Scanner;

//program to demonstrate on User-defined Exception
//driver class
public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials {
	  Scanner s=new Scanner(System.in);
	  String email=s.nextLine();
	  String password=s.nextLine();
	  try {
	     if(email.equals("sans@gmail.com") && password.equals("Pass@123"))
	      {
		  System.out.println("Credentials matched");
	       }
	     else
	     {
		  throw new LoginCredentials("Invalid credentials");
	     }
	   }
	  catch(LoginCredentials e)
	  {
		  System.out.println(e);
	  }

	}

}
