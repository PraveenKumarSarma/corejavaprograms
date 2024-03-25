import java.util.Scanner;
class  SumProduct
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = a.nextInt();
		int sum = 0;
		while(num != 0)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
			{
				sum = sum + digit;
			}
			else
			{
				sum = sum * digit;
			}
			num /= 10;
		}
		System.out.println(sum);
		a.close();
	}
}
