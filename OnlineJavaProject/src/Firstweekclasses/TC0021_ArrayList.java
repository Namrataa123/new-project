package Firstweekclasses;

import java.util.ArrayList;

public class TC0021_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList ();
		arr.add("namrata");
		arr.add("mannat");
		arr.add(15.6);
		arr.add('r');
		arr.remove(0);
		for(int i=0;i<arr.size();i++ )
		{
			System.out.println(arr.get(i));
		}
	}

}
//for loop for is all about int for running the loop doesnt matter whether we have declraed string,- NM
