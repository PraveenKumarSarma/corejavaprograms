import java.util.Scanner;
class  Service
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Enter current year");
		int cy = a.nextInt();
		System.out.println("Enter year of joining");
		int yoj = a.nextInt();
		int bonus = 0;
		int yr_of_ser = 0;
		yr_of_ser = cy - yoj;
		if(yr_of_ser > 3)
		{
			bonus = 2500;
			System.out.println(bonus);
		}
		a.close();
	}
}
