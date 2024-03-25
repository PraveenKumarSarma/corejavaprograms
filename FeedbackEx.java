import java.util.Scanner;
class  FeedbackEx
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Enter your grade A B C D....");
		char grade = a.next().charAt(0);
		String feedback = null;

		switch(grade)
		{
			case 'A': feedback = "Excellent job!";
					  break;
			case 'B': feedback = "Good job!";
					  break;
			case 'C': feedback = "you can do better";
					  break;
		    case 'D': feedback = "Need improvement";
					  break;
			default: System.out.println("Enter valid option");
					  break;
		}
		System.out.println("feedback = "+feedback);
		a.close();
			
	}
}
