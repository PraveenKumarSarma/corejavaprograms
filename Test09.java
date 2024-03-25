import java.util.*;
class  Test09
{
	static void validate(int age)
	{
		if(age > 18)
		{
			System.out.println("eligible for marriage");
		}
		else
		{
			throw new ArithmeticException("not eligible for marriage");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your age");
		int age = s.nextInt();
		Test09.validate(age);
	
	}
}
