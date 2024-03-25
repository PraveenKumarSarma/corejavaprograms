import java.util.Scanner;
class LogCheck 
{
	public static void main(String[] args) 
	{
        Scanner s = new Scanner(System.in);

		System.out.println("Enter emailid/phno");
		String username = s.next();

		if((username.matches("\\d{10}")) || (username.contains("@gmail.com")))
		{
			System.out.println("you are valid user"+username);
		}
		else
		{
			System.out.println("you are invalid user"+username);
		}
		s.close();
	}
}
