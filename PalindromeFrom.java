class PalindromeFrom 
{
	public static void main(String[] args) 
	{
		int n = 50;
		for(int i = 1; i <= n;i++)
		{
			int num1 = i,rev = 0;
			while(num1 != 0)
			{
				int digit = num1 % 10;
				rev = rev * 10 + digit;
				num1 /= 10;
			}
			if(i == rev)
			{
				System.out.println(i + " ");
			}
		}
	}
}
