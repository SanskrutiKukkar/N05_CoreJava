package org.tsnf.operator;
import java.util.*;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value:");
		int num1=sc.nextInt();
		System.out.println("enter second value:");
		int num2=sc.nextInt();
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1%num2);
		System.out.println(num1/num2);
		sc.close();
		// TODO Auto-generated method stub

	}

}
