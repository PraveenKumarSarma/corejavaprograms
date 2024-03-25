import java.util.Scanner;
class  Insured
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter status married/unmarried");
		String status = s.next();
		System.out.println("Enter gender");
		String gender = s.next();
		System.out.println("Enter age");
		int age = s.nextInt();
		if(status.equals("married"))
		{
			System.out.println("Insured under 1");
		}
		else if(status.equals("unmarried") && gender.equals("male") && age > 30)
		{
			System.out.println("Insured under 2");
		}
		else if(status.equals("unmarried") && gender.equals("female") && age > 25)
		{
			System.out.println("Insured under 3");
		}
		else
		{
			System.out.println("not insured");
		}
		s.close();
	}
}
