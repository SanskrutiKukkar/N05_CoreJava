//driver class
/*program to demonstrate on default and parameterized constructor*/
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Citizen c=new Citizen();
       
        
        Citizen c1=new Citizen("Adult",3245456798L,"Female","Nagpur");
        System.out.println(c1);
	}

}
