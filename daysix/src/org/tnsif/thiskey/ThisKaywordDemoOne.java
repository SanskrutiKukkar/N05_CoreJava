//instance of variable in the class
package org.tnsif.thiskey;

public class ThisKaywordDemoOne {

	//default variable
	int x,y;
	
	void setData(int x,int y)
	{
		//any name can be give instead of x and y
		this.x=x;
		this.y=y;
	}
	void display()
	{
		
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		ThisKaywordDemoOne t=new ThisKaywordDemoOne();
		t.setData(2, 3);
		t.display();

	}

}
