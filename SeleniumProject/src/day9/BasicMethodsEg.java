package day9;

public class BasicMethodsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicMethodsEg bm=new BasicMethodsEg();
		bm.Function3();
		
		boolean result=bm.Function4();
		System.out.println(result);
		
	}
	
	//static method without returning anyvalue
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//static method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
		
	}
	
	//Non Static Methods without returning anyvalue
	
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	
	//Non static Method with returning value
	
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}

}
