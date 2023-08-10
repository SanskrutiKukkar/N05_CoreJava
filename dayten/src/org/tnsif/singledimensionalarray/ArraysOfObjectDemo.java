package org.tnsif.singledimensionalarray;
//driver class
//program to demonstrate on arrays of objects
public class ArraysOfObjectDemo {

	public static void main(String[] args) {
	Employee arr[]=new Employee[2];
    arr[0]=new Employee(101,"Sans k",234540.8);
    arr[1]=new Employee(102,"Sakshi k",894540.5);
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(arr[i].getID()+" "+arr[i].getName()+" "
    			+arr[i].getSalary());
    }
}	

}
