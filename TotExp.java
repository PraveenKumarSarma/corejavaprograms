import java.util.Scanner;
class TotExp 
{
	public static void main(String[] args) 
	{
		int dis = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter quantity required");
		int qty = s.nextInt();
		System.out.println("Enter price");
		double rate = s.nextDouble();
		double tot = 0.0;
		tot = qty * rate;
		if(tot > 1000)
		{
			dis = 10;
		}
		tot = tot - tot * dis / 100;
		System.out.println(tot);
		s.close();
	}
}
