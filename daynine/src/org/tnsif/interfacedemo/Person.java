package org.tnsif.interfacedemo;
//child class or implementable class
//program to demonstrate on multiple inheritance
public class Person implements ColdDrink,Alcohol{

	@Override
	public void showDrinkName() {
		
		System.out.println(brand+" "+alcoholname+" "+name);
		
	}

}
