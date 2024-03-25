class PatternH 
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		for(int row = 1; row <= 5; row++)
		{
			for(int col =1; col <=row; col++)
			{
		     System.out.print(ch);
			 ch++;
			}
			System.out.println();
		}
	}
}
