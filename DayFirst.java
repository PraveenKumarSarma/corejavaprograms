import java.util.Scanner;
class DayFirst
{
	public static void main(String[] args) 
	{
		int n = 1900;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter any year");
		int year = a.nextInt();
		int dif = year - n;
		int l = dif / 4;
		int days = dif * 365 + l;
		int week = days % 7;
		switch(week)
		{
			case 0: System.out.println("Monday");
					break;
			case 1: System.out.println("Tuesday");
					break;
			case 2: System.out.println("Wednesday");
					break;
			case 3: System.out.println("Thursday");
					break;
			case 4: System.out.println("Friday");
					break;
			case 5: System.out.println("Saturday");
					break;
			default : System.out.println("Sunday");
					  break;
		}
		a.close();
	}
}

