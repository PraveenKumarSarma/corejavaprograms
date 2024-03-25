class StarProgram1 
{
	public static void main(String[] args) 
	{
		int n=6;
		for(int row=1;row<=n;row++)
		{
			for(int space=1;space<=n-row;space++)
			{
				System.out.print(" ");
			}
			for(int stars=1;stars<=row;stars++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int m=5;
		for(int row=m;row>0;row--)
		{
			for(int space=0;space<=m-row;space++)
			{
				System.out.print(" ");
			}
			for(int stars=row;stars>0;stars--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
