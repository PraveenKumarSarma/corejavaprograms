import java.util.Scanner;
class  ArithmeticOperation
{
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = a.nextInt();

		System.out.println("Enter the second number");
		int num2 = a.nextInt();

		System.out.println("Enter your option + - * / %");
		char operator = a.next().charAt(0);
		
		switch(operator)
		{
			case '+': System.out.println("Addition of two numbers is "+(num1+num2));
			          break;
			case '-': System.out.println("Subtraction of two numbers is "+(num1-num2));
			          break;
			case '*': System.out.println("Multiplication of two numbers is "+(num1*num2));
			          break;
		    case '/': System.out.println("quotient of two numbers is "+(num1/num2));
			          break;
			case '%': System.out.println("Remainder of two numbers is "+(num1%num2));
			          break;
			default : System.out.println("Enter valid Arithmetic Operator");
			          break;
		}
		a.close();
	}
}
