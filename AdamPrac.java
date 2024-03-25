class AdamPrac 
{
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int digit=n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		
		int n=13;
		int square=n*n;
		int nrev=AdamPrac.reverse(n);
		int rsquare=nrev*nrev;
		int frev=AdamPrac.reverse(rsquare);
		
		if(frev==square)
		{
			System.out.println("Adam number");
		}
		else
		{
			System.out.println("not adam number");
		}
	}
}
