package javaprogrammes;

public class StringEg {

	public static void main(String[] args)
	{
		String course="Selenium";// muineleS
		
		//Find the length of the string
		
//		System.out.println(course.length());
		
		// Finding 5 th index value
//		System.out.println(course.charAt(5));
		
		//
//		System.out.println(course.substring(1, 6));
		int len=course.length();
		for (int i = 0; i < len; i++)
		{
			System.out.println(course.charAt(i));
		}
		System.out.println("----");
		for (int i = len-1; i >= 0; i--)
		{
			System.out.print(course.charAt(i));
		}
	}

}
