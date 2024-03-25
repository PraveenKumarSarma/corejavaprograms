import java.util.Scanner;
class  Employee
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your option 1.Manager 2.Teamlead 3.Developer 4.HR");
		String option = s.next();

		switch(option)
		{
			case "manager"  :  System.out.println("Manages the work");
						       break;
			case "teamlead" :  System.out.println("Writes complete work");
						       break;
			case "developer":  System.out.println("Learning Stage");
						       break;
		    case "hr"       :  System.out.println("Recruits people");
						       break;
			default         :  System.out.println("Enter valid input");
						       break;
		}
		s.close();

	}
}
