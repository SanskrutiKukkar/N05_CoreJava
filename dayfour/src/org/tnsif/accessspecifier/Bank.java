//program to demonstrate on Access specifier
package org.tnsif.accessspecifier;
public class Bank {
	
	//different account specifier
     public String bankName;
     private int pinNo;
     long accountNo=342343245334L;
     
     //public method
     public void displayPublic()
     {
    	 System.out.print("Bank name is: "+bankName);
     }
     
     //private method
     private void displayPrivate()
     {
    	 System.out.println("Pin No.is: "+pinNo);
     }
     
     //default method
     void displayDefault()
     {
    	 System.out.println("Account No. is: "+accountNo);
     }
	
}
