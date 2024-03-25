class PatternLast1
{
	public static void main(String[] args) 
	{    int n = 4;
		for(int row = 1; row <= n; row++)
		{
			
		    //print spaces
			   for(int space = row; space < n; space++)
		     	{
			    	System.out.print(" ");
			    }
			  for(int k = 1; k <= (2*row)-1; k++)
			   {
				System.out.print("*");
			   }
			
			System.out.println();
			
		}

		for(int row = 4;row >= 1; row--)
		{
			
			 for(int space = row; space < 4; space++)
			 {
				System.out.print(" ");
			 }
			//print asterisk
			 for(int k = 1; k <= (2*row)-1; k++)
			 {
				System.out.print("*");
			 }
			 System.out.println();
		}
		
	}
}
