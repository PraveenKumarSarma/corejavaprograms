import java.util.Scanner;
class  PosNegZero
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a number");
		int num = s.nextInt();

		if(num > 0)
		{
			System.out.println("number is positive");
		}
		else if(num < 0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
		s.close();
	}
}
