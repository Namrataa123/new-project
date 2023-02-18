package Firstweekclasses;

public class TC0012ex_AbstractClass extends TC0011_AbstractClass{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TC0012ex_AbstractClass obj = new TC0012ex_AbstractClass();
			obj.Addition(12, 13);	
			obj.display();
			
			
		
	}

	@Override
	void Addition(int a, int b) {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println(c);
	}

}
