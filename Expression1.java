
class Expression1 
{
	public static void main(String[] args) 
	{
		String data="1,2,3,-3,7,*10";
		String[] words=data.split(",");
		String last = words[words.length-1];
		int[] res = new int[words.length-1];
		
		for(int i=0;i<words.length-1;i++)
		{
			res[i] = Integer.parseInt(words[i]);
		
		}

		String l =  last.replace("*","");
		Integer fin1= Integer.parseInt(l);
		int sum = 0;
		for(int i=0;i<res.length;i++)
		{
			sum = sum + res[i];
		}
		fin1 = sum * fin1;
		System.out.println(fin1);
	}
}
