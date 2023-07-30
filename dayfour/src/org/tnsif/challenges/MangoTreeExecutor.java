/* Pratik is so much interested in gardening and hence he plants more tre-
 *es in his garden. He plants trees in a rectangular fashion in 
 *order of rows and columns and numbers the trees in a row wise order.
 *He planted the Mango tree only in the first row,first column and 
 *last column. So, given the tree number and rows and columns your
 *task is to find out weather the given tree is mango tree or not
 *n=5...rows and columns number t=11...trees number*/

package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a mango tree");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of n and t: ");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		
	}

}
