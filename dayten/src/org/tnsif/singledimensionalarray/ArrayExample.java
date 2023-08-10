package org.tnsif.singledimensionalarray;
//program to demonstrate on array using compile-time input values
public class ArrayExample {

	public static void main(String[] args) {
		//declaration and initialization of an array at compile-time
		int arr[]= {44,56,2,32,28};
		System.out.println("The array of 2nd index is: "+arr[2]);
		//to print all the values of array
		for(int i:arr) //enhanced for loop
		{
			System.out.print(i+" ");  //iterator 'i' is used
		}
		
	}

}
