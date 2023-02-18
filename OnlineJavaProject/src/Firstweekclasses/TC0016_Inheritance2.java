package Firstweekclasses;

class bank
{
	public void display()
	{
		System.out.println("this is the display method");
	}
}

class SBI extends bank
{
	public void get()
	{
		System.out.println("this is the get method");
	}
}

class rbc extends bank
{
	public void display1()
	{
		System.out.println("this is the display1 method");
	}
	
}

public class TC0016_Inheritance2 extends rbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI obj = new SBI();
obj.get();
obj.display();
//note when ever we are using rbc it will display the parent class method and the rbc method, if we will use sbi 
//then it will display sbi and the parent class method
	}

}
