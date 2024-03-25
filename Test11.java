import java.util.Scanner;
class Test11 
{
	public static void main(String[] args) 
	{
		try(Scanner s = new Scanner(System.in))
		{
			System.out.println("enter a number");
			int num = s.nextInt();
			System.out.println("your number ...."+num);
		}
	}
}
