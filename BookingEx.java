import java.util.Scanner;
class  BookingEx
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter booking status(online/offline)");
        String status = s.next();

		if(status.equalsIgnoreCase("online"))
		{
			System.out.println("Directly go to movie");
		}
		else if(status.equalsIgnoreCase("offline"))
		{
			System.out.println("Go to box office,take the tickets");
		}
		else
		{
			System.out.println("Enter the valid input");
		}
		s.close();
	}
}
