class TestNew 
{
	void m3()
	{
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

		}
	}
	void m2()
	{
		m3();
	}
	void m1()
	{
		m2();
	}
	public static void main(String[] args) 
	{
		TestNew t = new TestNew();
		t.m1();
	}
}
