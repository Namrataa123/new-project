package Firstweekclasses;

import java.util.ArrayList;

public class ExceptionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al = new ArrayList();
try
{
al.add(122);
al.add(456);
al.add(23);

al.get(5);
	} catch(Exception e)
{
e.printStackTrace();		;
		}
}

}
