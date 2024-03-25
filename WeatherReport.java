import java.util.Scanner;
class  WeatherReport
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("is it raining out");
		boolean isRaining = a.nextBoolean();

		System.out.println("is it wind out");
		boolean isWinding = a.nextBoolean();

		if(isRaining && isWinding)
		{
			System.out.println("Cyclone,don't go outside");
		}
		else if(isRaining || isWinding)
		{
			System.out.println("Weather not ideal,your choice to go out");
		}
		else
		{
			System.out.println("Weather is cool,you can go out");
		}
		a.close();
	}
}
