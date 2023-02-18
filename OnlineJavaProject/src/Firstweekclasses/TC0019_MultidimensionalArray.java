package Firstweekclasses;

public class TC0019_MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int nos[][] = new int[2][2];
 {
	 nos[0][0]=100;
	 nos[0][1]=200;
	 //nos[0][2]=300;
	 nos[1][0]=400;
	 nos[1][1]=500;
	 //nos[1][2]=600;
	 
	 
	 
	 for(int i =0;i <nos.length;i++)
	 {
		for(int j=0; j<=nos[0].length;j++)
		{
			System.out.println(nos[i][j]);
			}
		System.out.println(nos[i][j]+"");
	 }
	 
 }
	}

}
