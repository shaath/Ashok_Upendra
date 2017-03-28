package javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] s={"Selenium",30000,'M',44.44,true};
		
		System.out.println(s.length);
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}

	}

}
