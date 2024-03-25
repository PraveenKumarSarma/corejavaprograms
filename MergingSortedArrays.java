class MergingSortedArrays 
{
	public static void main(String[] args) 
	{
		
		int[] a = {1,3,5,6,7};
		int[] b = {6,6,7,8,9};
		int[] c = new int[a.length+b.length];

		int i=0,j=0,k=0;
		//merging two sorted arrays
	
		
		while(i < a.length && j < b.length)
		{
			if(a[i] < a[j])
				c[k++] = a[i++];
			else
				c[k++]=b[j++];
		}

		while(i < a.length)
		c[k++] = a[i++];
		while(j < b.length)
		c[k++] = b[j++];



		for(int c1 : c)
		{
			System.out.print(c1+ " " );
		}
	}
				


	
}
