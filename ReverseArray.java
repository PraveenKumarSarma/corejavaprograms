class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,3,4,5,2};
		System.out.println("Array elements in sequence is:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Array elements in reverse order are:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}


	}
}
