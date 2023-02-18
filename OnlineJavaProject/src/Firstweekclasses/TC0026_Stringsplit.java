package Firstweekclasses;

public class TC0026_Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  dob= "12/34/4500";
	String s[]= dob.split("/");
	System.out.println(s[0]);
	System.out.println(s[1]);
System.out.println(s[2]);


//another example of split

String Fullname= "Namrata malhotra";
 String ExpValue[]= Fullname.split(" ");
  System.out.println(ExpValue[0]);
  System.out.println(ExpValue[1]);
  
  
  //another example of split
  String Fullname1= "Namrata malhotra";
  String ExpValue1[]= Fullname1.split(" ");
  for (int i=0; i<ExpValue1.length;i++)
{
	System.out.println(ExpValue1[i]);}


	}

}
