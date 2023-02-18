package Firstweekclasses;

import java.util.ArrayList;

public class TC0029_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		ArrayList al = new ArrayList();
		al.add("ekas");
		al.add(500);
		al.add("mannat");
		al.get(5);
		
	}finally {
		System.out.println("log out of application");
	}
      System.out.println("Exception handled");
    }
	}
