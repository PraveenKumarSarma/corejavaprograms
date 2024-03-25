class Prime
{
	public static void main(String[] args)
	{
		int n = 20;
		for(int num = 5; num <= n; n++)
		{
			int fact = 0;
			for(int i =2; i<num; i++)
			{
				if(num % i == 0)
				{
					fact++;
					break;
				}
			}
			if(fact == 0)
			{
				System.out.println(num);
			}
		}
	}
}