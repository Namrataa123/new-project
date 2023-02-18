package Firstweekclasses;

public class TestSplit {

	public static void main(String[] args) {
		
		
		
	/*	String s1="Order ID 235678";
		
	   String arr1[]=s1.split("Order ID");
	   
	   System.out.println("First value ==> "+arr1[0]);
	   
	   System.out.println("Second  value ==> "+arr1[1].trim());*/
		
		String s= "Order ID 23456";
	String s1[]=	s.split("Order ID");
	  System.out.println(s1[0]);
	  System.out.println(s1[1].trim());
		
	   
	   String s2="Card Number : 123456789 05/24 323";
	   
	   String s3[]=s2.split("Card Number :");
	   
	   System.out.println("First card details "+s3[0]);
	   
	   System.out.println("Second card details "+s3[1]);
	   
	   //123456789 05/24 323
	   
	   String s4=s3[1].trim();
	   
	  String s5[]= s4.split(" ");
	  
	  
	  
	  System.out.println("Card Number ==> "+s5[0]);
	  
	  System.out.println("Expiry Number ==> "+s5[1]);
	  
	  System.out.println("CVV Number ==> "+s5[2]);
	  
	   
	   /*practics by me*/
	  
		String dob = "10/20/1990";
	String r[]=	dob.split("/");
		System.out.println(r[0]);
		System.out.println(r[1]);
		System.out.println(r[2]);
		
		
		String expValue ="Namrata Malhotra 1984 gmail inbox";
		String actvalue="Namrata nimmi 67890 678 engineer";
	int StrIndex=	expValue.indexOf("amrita");
	System.out.println(StrIndex);
		if(StrIndex >0)
		{
			System.out.println("Malhotra is present in the text");
			
		}else {
			System.out.println("it is not prsent");
		}
		}

	
	}
	
	
	
	


