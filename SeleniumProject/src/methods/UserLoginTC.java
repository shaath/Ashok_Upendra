package methods;

public class UserLoginTC {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Launch Application "+res);
		
		res=om.org_Login("SharathChandra1233", "SharathChandra1233");
		System.out.println("Login  Application "+res);
		
		res=om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

	}

}
