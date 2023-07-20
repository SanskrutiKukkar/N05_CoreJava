//program to demonstrate on userinput
package org.tns.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        /*System.out.println("Enter the value of num");
        int num=s.nextInt();
        System.out.println("The value of num is= "+num);
        System.out.println("Enter the value of floatnum");
        float num1=s.nextFloat();
        System.out.println("The value of floatnum is= "+num1);
        
        System.out.print("Enter the value of char");
        char c=s.next().charAt(0);  //charAt(0) is the 1st index
        System.out.print("Character is: "+c);*/
        
        System.out.print("Enter the value od string");
        String str1=s.nextLine();
        //s.next();
        System.out.print("String is: "+str1);
	}

}
