import java.util.Scanner;
class  LanguageSelection
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your option 1.Telugu 2.Hindi 3.English 4.Kanada 5.Tamil");
		int option = s.nextInt();

		switch(option)
		{
			case 1: 
						System.out.println("you selected Telugu");
						System.out.println("This conversation in telugu");
						break;
			case 2:
				        System.out.println("you selected Hindi");
						System.out.println("This conversation in hindi");
						break;
			case 3:
				        System.out.println("you selected English");
						System.out.println("This conversation in English");
						break;
			case 4:
				        System.out.println("you selected Kanada");
						System.out.println("This conversation in Kanada");
						break;
			case 5:
						System.out.println("you selected Tamil");
						System.out.println("This conversation in Tamil");
						break;
		    default:    System.out.println("Enter valid option");
						break;
		}
		s.close();
				        
	}
}
