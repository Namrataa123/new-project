package Firstweekclasses;

class Cat
{
public void display()
{
	System.out.println("this is sinle Inheritance of Cat");
}

public Cat()
{
System.out.println("this is the constructor");	
}
}

class Kitten extends Cat{
	public void display()
	{
		System.out.println("this is cat  ");
	}
	
  Kitten()
 {
	 System.out.println("this is the kitten");
 }
}


public class TC0015_Inheritence extends Kitten {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TC0015_Inheritence obj = new TC0015_Inheritence();
obj.display();

		
		
		
	}

}
