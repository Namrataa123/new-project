package Firstweekclasses;

public class TC_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int marks=90;
		if (marks >60 && marks <=70 )
		{
			System.out.println("grade is b   " +marks);
		}
		else if(marks>70 && marks <=80 ){
			System.out.println("grade is c" +marks);
			
		}
		else if(marks>80 && marks <=90)
		{
			System.out.println("grade is d" +marks);
			
		}
		else if(marks >90)
		{
			System.out.println("grade is A");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
}
}