class PalindromePrac1 
{
	public static void main(String[] args) 
	{
		int n=121,rev=0;
		int i=n;
		while(n>0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}

		if(rev==i)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}
