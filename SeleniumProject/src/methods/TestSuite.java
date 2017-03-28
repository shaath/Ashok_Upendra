package methods;

public class TestSuite {

	public static void main(String[] args)
	{
		//Login
		
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Launch Application "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login  Application "+res);
		
		res=om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");
		
		//Empreg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Launch Application "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login  Application "+res);
		
		res=om.org_Empreg("Sandeep", "Kumar");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");
		
		//UserReg
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Launch Application "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login  Application "+res);
		
		res=om.org_Userreg("Sandeep Kumar", "SandeepKumar", "SandeepKumar", "SandeepKumar");
		System.out.println("User Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

		//UserLogin
		
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Launch Application "+res);
		
		res=om.org_Login("SandeepKumar", "SandeepKumar");
		System.out.println("Login  Application "+res);
		
		res=om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

	}

}
