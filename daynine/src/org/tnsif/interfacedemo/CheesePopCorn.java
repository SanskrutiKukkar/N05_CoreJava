package org.tnsif.interfacedemo;
//implementable class for a functional interface
public class CheesePopCorn implements PopCorn{

	@Override
	public void displayReceipe() {
		
		System.out.println("take popcorn packets "+"from shop and"
				+ "cook it in high fire inside cooker");
		
	}

}
