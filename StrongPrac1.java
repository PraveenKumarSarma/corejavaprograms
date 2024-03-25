class StrongPrac1 
{public static void main(String[] args) 
	{	int n=145,temp=n,sum=0;
		while(n!=0)
		{
			int fact=1;
			int digit=n%10;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not strong number");
		}	
	}
}
