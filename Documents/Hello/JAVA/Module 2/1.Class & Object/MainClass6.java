class LoginPage
{
	String username;
	String password;

	void login()
	{
		System.out.println("Login with UsserName & Password");
	}
	void createAccount()
	{
		System.out.println("Redirect to SignUp page ");
	}
	void forgotPassword()
	{
		System.out.println("Password recovery Options ");
	}
}
public class MainClass6{

public static void main(String[] args)
{
	LoginPage l1=new LoginPage();
	l1.username="Kumar";
	l1.password="kumar123";


	l1.login();
	l1.createAccount();
	System.out.println("-------------------");

	LoginPage l2=new LoginPage();
	l2.username="Raja";
	l2.forgotPassword();

	System.out.println("-------------------");

	LoginPage l3=new LoginPage();
	
	l3.createAccount();

}
}