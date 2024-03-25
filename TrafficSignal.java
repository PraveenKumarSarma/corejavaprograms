import java.util.Scanner;
class  TrafficSignal
{
	void redInfo()
	{
		System.out.println("This is Danger Signal");
		System.out.println("stop here");
		System.out.println("Do not move forward");
	}

	void yellowInfo()
	{
		System.out.println("It is alert notification");
		System.out.println("Be ready");
		System.out.println("Start your vehicle engine");
	}

	void greenInfo()
	{
		System.out.println("You have to go");
		System.out.println("don't stop here");
		System.out.println("go with some speed");
	}
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
          
		TrafficSignal ts = new TrafficSignal();
		
		System.out.println("Enter the color of traffic light");
		String color = s.next();

		switch(color)
		{
			case "red"   : ts.redInfo();
						   break;
			case "yellow": ts.yellowInfo();
						   break;
			case "green" : ts.greenInfo();
						   break;
			default      : System.out.println("Enter valid traffic light");
						   break;
		}
		s.close();
		
	}
}
