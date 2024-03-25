import java.util.Scanner;
class  Week
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any day....");
		String day = s.next();

		switch(day)
		{
			case "mon": System.out.println("Mondays are bad");
			            break;
		    case "fri": System.out.println("Fridays are good");
			            break;
			case "sat":
			case "sun": System.out.println("Party days, enjoy");
						break;
			default   : System.out.println("mid days are ok ok");
						break;
		}
		s.close();
	}
}
