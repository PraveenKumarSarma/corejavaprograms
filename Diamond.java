class Diamond 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int row=1;row<=n;row++)
		{
			for(int space=n-row;space>=0;space--)
			{
				System.out.print(" ");
			}

			for(int stars=2*(row)-1;stars>0;stars--)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		int m=4;
		for(int row=m;row>0;row--)
		{
			for(int space=0;space<=m-row+1;space++)
			{
				System.out.print(" ");
			}
			for(int stars=2*(row)-1;stars>0;stars--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
