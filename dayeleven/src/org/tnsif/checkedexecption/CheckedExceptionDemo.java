package org.tnsif.checkedexecption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\SANSKRUTI\\Downloads\\hello.txt");
			System.out.println("File has found");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: "+e);
		}

	}

}
