import java.util.Scanner;
class  ArithmeticOper
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = s.nextInt();

		System.out.println("Enter the second number");
		int num2 = s.nextInt();

		System.out.println("Enter your option + - * / %");
		char operator = s.next().charAt(0);

		int result = 0;

		switch(operator)
		{
			case '+': result = num1 + num2;
					  break;
			case '-': result = num1	- num2;
					  break;
			case '*': result = num1 * num2;
				      break;
			case '/': result = num1 / num2;
					  break;
			case '%': result = num1 % num2;
					  break;
			default : System.out.println("Enter valid Arithmetic operator");
					  break;
		}
		System.out.println("you selected operator "+operator+" "+"result = "+result);
		s.close();
	}
}
