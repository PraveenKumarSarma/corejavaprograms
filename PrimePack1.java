class PrimePack1 
{
	public static void main(String[] args) 
	{
		int n=7,fact=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				fact++;
				break;
			}
		}
		if(fact==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}
