package org.tnsif.interfacedemo;

public interface DebitCard {
	/*by default all the variables inside an interface is public,
	 * static, final and if it is final then we must have to 
	 * initialize value for that variable
	 * */
    long cardno=67890987699L;
    //we can't use concrete method inside an interface
    //by default, method inside an interface is an abstract
    void displayCardDetails();
    /* default method and static method is the new features of Java 8
     * which we can use inside an interface */
    default void display()
    {
    	System.out.println("Default method");
    }
    //static method
    static void print()
    {
    	System.out.println("static method");
    }
    
	
}
