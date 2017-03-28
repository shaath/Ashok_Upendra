package javaprogrammes;

public class NesteIfEg {

	public static void main(String[] args)
	{
		int a=400000;
		int b=60000;
		int c=10000;
		
		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > a & b > c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
