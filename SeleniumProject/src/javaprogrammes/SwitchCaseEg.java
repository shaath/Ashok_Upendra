package javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) 
	{
		String course="Selenium";
		
		switch (course) 
		{
		case "Manual":
			System.out.println("You are selected manual");
			break;
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "Uft":
			System.out.println("You are selected Uft");
			break;
		case "LoadRunner":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Select a proepr course");
			break;
		}

	}

}
