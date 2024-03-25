import java.util.Scanner;
class  VotingCheck
{
	public static void main(String[] args) 
	{
		//creation of scanner object
		Scanner a = new Scanner(System.in);
		
		//Read data from command prompt
		System.out.println("Enter age");
		int age = a.nextInt();

		if(age > 18)
		{
			System.out.println("eligible for voting"+age);
		}
		else
		{
			System.out.println("not eligible wait"+age);
		}

	}
}
