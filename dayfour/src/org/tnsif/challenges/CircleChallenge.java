package org.tnsif.challenges;

import java.util.Scanner;

/* There are n people standing in a circle waiting to be executed.
 * The counting out begins at some point in the circle and processed
 * around circle in a fixed directions. In each step a certain no. of people
 * are skipped and the next person is executed. The eliminated 
 * processed around the circle(which is becoming smaller and smaller as the
 * executed people are removed), until only the last person remains,
 * who is given freedom
 * Given the total no. of person n and a number k which indicates 
 * that k-1 person are skipped and kth person is killed
 * the task is to choose the initial person that survives 
 * n=10 k=2*/
public class CircleChallenge {
	
	static int survive(int n,int k)
	{
		if(n==1)
		     return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));

	}

}
