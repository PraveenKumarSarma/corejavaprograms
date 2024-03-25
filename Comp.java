class Comp 
{
	public static void main(String[] args) 
	{
		int bs = 2000;
		double hra = 0.0,da = 0.0,gs = 0.0;
		if(bs < 1500)
		{
			hra = bs * 0.1;
			da = bs * 0.9;
		}
		else
		{
			hra = 500;
			da = bs * 0.98;
		}
		gs = bs + hra + da;
		System.out.println(gs);
	}
}
