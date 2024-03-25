import java.util.Scanner;
class NegativeNumberException extends RuntimeException
{
	public NegativeNumberException(String msg)
	{
		super(msg);
	}
}
class ZeroException extends RuntimeException
{
	public ZeroException(String msg)
	{
		super(msg);
	}
}
class  Exception3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num < 0 )
		{
			throw new NegativeNumberException("This is negative number");
		}
		else if(num == 0)
		{
			throw new ZeroException("This number is zero");
		}
		else
		{
			System.out.println("your number is valid");
		}
	}
}
