import java.util.*;
class  Exception1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age");
		try
		{

			int age1 = s.nextInt(); 
			System.out.println("your age is "+ age1); 
			System.out.println("Enter new age");
		String age = s.next();
		System.out.println("your second age is "+ age);
		int num = Integer.parseInt(age);
		}
		catch(NumberFormatException n)
		{
			System.out.println("The string containing letters leads to "+n);
		}

		catch (InputMismatchException i)
		{
			System.out.println(" enter valid number "+i);
		}
		
		finally
		{
			s.close();
		}
	}
}