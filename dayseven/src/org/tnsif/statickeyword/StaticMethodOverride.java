package org.tnsif.statickeyword;
//we can't override static method
public class StaticMethodOverride {

	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		//we can't override static method
		t.run();

	}

}
