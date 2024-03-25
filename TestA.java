class TestA
{
	public static void main(String[] args) 
	{
		A a = new A();
		Demo.add(a);
	}
}

class A
{
	int x = 5;
	int y = 3;
}

class Demo
{
	static void add(A a1)
	{
		a1.x = 7;
		a1.y = 2;
		int sum = a1.x + a1.y;
		System.out.println(sum);
	}
}
