import java.util.*;
class  Exception5
{
	public static int division(int x,int y)
	{
		return x/y;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter first number");
			int n1 = s.nextInt();
			System.out.println("Enter second number");
			int n2 = s.nextInt();
			
			int div = Exception5.division(n1,n2);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(InputMismatchException ie)
		{
			System.out.println("enter valid number "+ie);
		}
		finally
		{
			s.close();
		}
		
	}
}
