class LargestFactor 
{
	public static void main(String[] args) 
	{
		int lf = 0, num = 12;
		for(int i = 1;i <= num/2; i++)
		{
			if(num % i == 0)
			{
				if(i > lf)
				{
					lf = i;
				}
			}
		}
		System.out.println("largest factor except that number = "+ lf);
	}
}
