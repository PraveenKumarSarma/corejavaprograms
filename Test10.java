class Test10 
{
	void m1(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	void m2(Exception e)
	{
		System.out.println(e.getMessage());
	}
	public static void main(String[] args) 
	{
		Test10 t = new Test10();
		t.m1(new ArithmeticException("/ by zero"));
		t.m2(new NumberFormatException("given invalid data"));
		t.m2(new ClassCastException("conversion not possible"));
	}
}
