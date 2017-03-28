package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		//Finding the length of the array
		
		System.out.println(x.length);
		
		//Write the data into array
		
		x[2]=40000;
		x[4]="Selenium";
		x[2]="Apple";

		//Reading the data into array
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}
	}

}
