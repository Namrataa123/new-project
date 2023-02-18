package Firstweekclasses;

public class TC006_MethodOverloading {

/*	Method1 public void add(int a, int b)
	{
		System.out.println("some of two numbers"   +(a+b));
	}
	
	public void add(double s,double s1)
	{
		System.out.println("some of two numbers" +(s+s1));
	}*/
	          
/*Method2  public static void mult( double a, double b)
	         {
		System.out.println("mult of numbers    "  +(a*b));
	         }
	
	public static void div(float c, float d) 
	{
		System.out.println("div of two numbers  " +(c/d));
		
	}*/
	
	
	 public static double mult(double d ,double e)
	 {
		return d*e;
		 
	 }
	 
	 public static double add (double c,double d)
	 {
		return c+d;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*method1	TC006_MethodOverloading m1= new TC006_MethodOverloading();
		m1.add(12,13);
		m1.add(23.5,12.5);*/
		
	/*  Method2	   TC006_MethodOverloading.mult(34,3);
		           TC006_MethodOverloading.div(25,5);*/
		
System.out.println(" mult is"  + TC006_MethodOverloading.mult(34.3, 100.7));
System.out.println("addition is "  + TC006_MethodOverloading.mult(12,5));
	//by changing the number of arguments and by changing the datatype	
		
	}

}
