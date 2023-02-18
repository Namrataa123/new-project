package Firstweekclasses;

public class TC009_Constructor {
//if constructor is private , no one can inherit and no one create an object of the class
	
	public TC009_Constructor()
	{
		int a=  10;
		System.out.println("this the default constructor  " +a );
	}
	
	
	public TC009_Constructor(String s,String s1)
	{
		System.out.println("this is the parmetrized constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TC009_Constructor obj = new TC009_Constructor();
 TC009_Constructor obj1 = new TC009_Constructor("namrata","mannat");
		
	}

}
