package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable f=new FinalVariable();
		/*we can;'t change the value of final variable*/
		//f.SALARY=789765.98f;
		f.print();
		
		Circle c=new Circle();
		c.printShapeType();
		c.printShapeType(c.area);

	}

}
