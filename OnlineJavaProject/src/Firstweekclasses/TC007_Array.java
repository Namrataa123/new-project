package Firstweekclasses;

public class TC007_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int arr[]= {2,3,4,5};
		for(int i= 0; i <arr.length;i++)
		{
			System.out.println(""+arr[i]);
		}
		System.out.println("***************************************************");
		int arr1[][]= {{2,3,4,5},{5,6,7,11,23,8,9}};
		for(int i=0; i<arr1.length;i++)
			
			
		{ 
			
			
			System.out.println("Total Rows COunt "+arr1.length);
			for(int j =0;j<arr1[i].length;j++)
			{
				
				System.out.println("Number of Column for row "+j+" and Number of total Column "+arr1[i].length);
				
				System.out.println(" "+arr1[i][j]);
			}
		}
		
		
	}

}
