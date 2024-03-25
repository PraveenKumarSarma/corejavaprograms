import java.util.Scanner;
class  LoginCheck
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter username");
		String username = s.next();

		System.out.println("Enter password");
		String password = s.next();

		if(username.equals("sathya") && password.equals("Sathya123"))
		{
			System.out.println("login successful"+username);
		}
		else
		{
			System.out.println("login fail...enter valid data");
		}
		s.close();

	}
}
