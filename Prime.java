class Prime
{
	public static void main(String[] args)
	{
		int n = 100;
		for(int num = 2; num <= n; num++)
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