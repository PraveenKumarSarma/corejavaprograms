class Division 
{
	public static void main(String[] args) 
	{
		int m1 = 60;
		int m2 = 61;
		int m3 = 62;
		int m4 = 63;
		int m5 = 64;
		int sum = m1+ m2+ m3+ m4+ m5;
		double percentage = sum / 500 * 100;
		if(percentage >= 60)
		{
			System.out.println("First division");
		}
		else if(percentage >= 50 && percentage < 60)
		{
			System.out.println("Second division");
		}
		else if(percentage >= 40 && percentage < 50)
		{
			System.out.println("Third division");
		}
		else
		{
			System.out.println("Fail");
		}

	}
}
