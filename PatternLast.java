class PatternLast
{
	public static void main(String[] args) 
	{
		for(int row = 1; row <= 6; row++)
		{
			if(row == 2 || row == 5)
			{
				continue;
			}
			else
			{
		    //print spaces
			   for(int space = 1; space <= 6-row; space++)
		     	{
			    	System.out.print(" ");
			    }
			  for(int k = 1; k <= row; k++)
			   {
				System.out.print("*");
			   }
			}
			System.out.println();
			
		}

		for(int row = 4;row >= 1; row--)
		{
			if(row == 2)
			{
				continue;
			}
			else
			{
			 for(int space = 1; space <= 6-row; space++)
			 {
				System.out.print(" ");
			 }
			//print asterisk
			 for(int k = 1; k <= row; k++)
			 {
				System.out.print("*");
			 }
			 System.out.println();
			}
		}
	}
}