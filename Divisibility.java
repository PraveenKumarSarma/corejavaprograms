import java.util.Scanner;
class  Divisibility
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter a number");
		int num = s.nextInt();

		if(num%3==0 && num%7==0)
		{
			System.out.println("number divisible by 3 and 7");
		}
		else
		{
			System.out.println("number not divisible by 3 and 7");
		}
		s.close();
	}
}
