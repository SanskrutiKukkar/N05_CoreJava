//program to demonstrate on switch case
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		  case 1:
			  System.out.println("Perfect");
			  break;
		  case 2:
			  System.out.println("Shape of you");
			  break;
	   	 case 3:
			  System.out.println("Stereo hearts");
			  break;
		 default:
			  System.out.println("Invalid input");
		}

	}

}
