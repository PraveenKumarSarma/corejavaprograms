import java.util.Scanner;
class  HealthCondition
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Are you feeling fever");
		boolean isFever = a.nextBoolean();

		System.out.println("Are you feeling cold");
		boolean isCold = a.nextBoolean();

		if(isFever || isCold)
		{
			System.out.println("You are sick, go to hospital");
		}
		else
		{
			System.out.println("You are ok, go to class");
		}
		a.close();
	}
}
