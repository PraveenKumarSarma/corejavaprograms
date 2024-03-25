class TestB 
{
	public int print(int x)
	{
		x = 6;
		return x;
	}
	public static void main(String[] args) 
	{
		int a = 4;
		TestB a1 = new TestB();
		System.out.println(a1.print(a));
	}
}
