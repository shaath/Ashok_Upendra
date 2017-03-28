package methods;

public class EmpregTc {

	public static void main(String[] args) 
	{
		OrgMaster om=new OrgMaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Launch Application "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login  Application "+res);
		
		res=om.org_Empreg("Sharath", "Chandra");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application logout "+res);
		
		om.org_Close();
		System.out.println("Application close successfull");

	}

}
