import java.util.Scanner;
class StudentDetails
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = s.next();
		System.out.println("Enter science marks");
	    int science = s.nextInt();
		System.out.println("Enter social marks");
	    int social = s.nextInt();
		System.out.println("Enter maths marks");
	    int maths = s.nextInt();

		int total = 0;
		total = science + social + maths;
		double avg = 0.0;
		avg = total/3;
		char grade = ' ';
		if(avg > 70)
		{
			grade ='A';
		}
		else if(avg >= 60 && avg <=70)
		{
			grade ='B';
		}
		else if(avg >= 50 && avg <60)
		{
			grade = 'C';
		}
		else if(avg >=35 && avg <50)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		System.out.println("Hey "+name+"your total marks "+total+" "+"avg is "+avg+" "+"grade = "+grade);
		s.close();
	}
}



	

