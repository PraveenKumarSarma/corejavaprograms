import java.util.Scanner;
class  Greater
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number1");
		int num1 = s.nextInt();

		System.out.println("Enter number2");
		int num2 = s.nextInt();

		if(num1 > num2)
		{
			System.out.println("num1 is bigger");
		}
		else if(num1 < num2)
		{
			System.out.println("num2 is bigger");
		}
		else
		{
			System.out.println("Both are equal");
		}
		s.close();

	}
}
