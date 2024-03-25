import java.util.Scanner;
class StudentAvg 
{
	public static void main(String[] args) 
	{
		//creation of scanner object
		Scanner a = new Scanner(System.in);

		//Read data from command prompt
		System.out.println("enter student name");
		String name = a.next();

        System.out.println("enter student rollno");
		int rollNo = a.nextInt();

		System.out.println("enter marks in science");
		int science = a.nextInt();

		System.out.println("enter marks in social");
		int social = a.nextInt();

		System.out.println("enter marks in maths");
		int maths = a.nextInt();

		//closing the scanner object
		a.close();

		int total;
		total = science+social+maths;
        double avg;
		avg= total/3;

		if(avg >50)
		{
			System.out.println("Student name..."+name);
			System.out.println("Student rollno..."+rollNo);
			System.out.println("Student total marks..."+total);
			System.out.println("Congratulations! you passed with average score "+avg);
		}
		else
		{
			System.out.println("Student name..."+name);
			System.out.println("Student rollno..."+rollNo);
			System.out.println("Student total marks..."+total);
			System.out.println("Sorry, you failed with an average score "+avg);
		}

	}
}
