import java.util.Scanner;
class  FindSal
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Enter gender");
		String gender = a.next();
		System.out.println("Enter years of service");
		int yos = a.nextInt();
		System.out.println("Enter qualification");
		String qual = a.next();
		double sal = 0.0;
		if(gender.equals("male"))
		{
			if(yos >= 10)
			{
				if(qual.equals("Post_Graduate"))
				{
					sal = 15000.0;
				}
				if(qual.equals("Graduate"))
				{
					sal = 10000.0;
				}
			}
			else
			{
				if(qual.equals("Post_Graduate"))
				{
					sal = 10000.0;
				}
				if(qual.equals("Graduate"))
				{
					sal = 7000.0;
				}
			}

		}
		else if(gender.equals("female"))
		{
			if(yos >= 10)
			{
				if(qual.equals("Post_Graduate"))
				{
					sal = 12000.0;
				}
				if(qual.equals("Graduate"))
				{
					sal = 9000.0;
				}
			}
			else
			{
				if(qual.equals("Post_Graduate"))
				{
					sal = 10000.0;
				}
				if(qual.equals("Graduate"))
				{
					sal = 6000.0;
				}
			}
		}

		else
		{
			System.out.println("Enter valid gender option");
		}
		System.out.println("salary = "+ sal);
	}
}
