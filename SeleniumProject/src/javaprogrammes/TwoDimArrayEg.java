package javaprogrammes;

public class TwoDimArrayEg 
{
	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		
		//Finding the length of the rows
		
		System.out.println("The length of the rows "+x.length);

		//Finding the length of the columns
		
		
		System.out.println("The length of the columns "+x[0].length);
		
		//Writing the data into array
		
		x[0][1]="Selenium";
		x[1][2]=50000;
		
		//Reading the data from array
		
//		System.out.println(x[0][0]);
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
			}
		}
		
	}

}
