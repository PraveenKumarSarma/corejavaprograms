class PascalPrac 
{
	public static void main(String[] args) 
	{
		int n=5,number=1;
		for(int row=0;row<n;row++)
		{
			for(int space=n-row+1;space>=0;space--)
			{
				System.out.print(" ");
			}
			number=1;
			for(int noOfValues=0;noOfValues<=row;noOfValues++)
			{
				System.out.print(number+" ");
				number=number*(row-noOfValues)/(noOfValues+1);
			}
			System.out.println();
		}


	}
}
