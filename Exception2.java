import java.util.Scanner;
class Exception2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] num = {1,2,3};
		try
		{
			
			System.out.println(num[4]/0);
			
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException ae)
		{
			System.out.println("This is "+ ae);
		}
		finally
		{
			s.close();
		}
		
	}
}
