package Firstweekclasses;

public class TC0022_Stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1= "I am learning automation";
		String s2 ="I am learning selenium";
		

		if (s1.equals(s2))
		{
			System.out.println(s1);
		}
		else
		{
			System.out.println(s2);
		}
		
		
	 

   String s3 ="Mobile testing";
   String s4= "QWERTY";
   String  s5=   s3.toUpperCase();
 System.out.println(s5);
    String s6 =s4.toLowerCase();
    System.out.println(s6);
    
    
        
    
    String r= "api testing ";
    String r1="api testing";
    if(r.equalsIgnoreCase(r1))
    {
    	System.out.println("successful");
    }
    else 
    {
    	System.out.println("unsuccessful");
    }
    
}
}