package org.tnsif.operators;

import java.util.Scanner;

public class AgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the age");
		int age=s.nextInt();
		System.out.println("enter the weight");
		int weight=s.nextInt();
		if(age>=18 && weight>=50)
		{
			System.out.println("Person is Eligible to donate blood");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		s.close();

	}

}
