package Firstweekclasses;

public class TC0014_interface implements TC0013Interface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   TC0014_interface obj = new TC0014_interface();
     obj.display();
     obj.counter(12,45);
	   
   
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is display method");
	}

	@Override
	public void counter(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the sum of a and b " +(a+b));
	}

}
