import java.util.Scanner;
class  ProductBill
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter product name");
		String name = s.next();
		
		System.out.println("Enter price of product");
		double price = s.nextDouble();

		System.out.println("Enter quantity");
		int qty = s.nextInt();
		
		double totalAmount = 0.0;
		totalAmount = price * qty;

		double discount = 0.0;
		if(totalAmount > 20000)
		{
			discount = 0.2;
		}
		else if(totalAmount >= 15000 && totalAmount <= 20000)
		{
			discount = 0.15;
		}
		else if(totalAmount >= 10000 && totalAmount < 15000)
		{
			discount = 0.1;
		}
		else
		{
			discount = 0.05;
		}
		double disAmount = 0.0;
		double netAmount = 0.0;
		disAmount = discount * totalAmount;
		netAmount = totalAmount - disAmount;
		System.out.println("Total Bill ="+totalAmount+"\n"+"discount Amount ="+disAmount+"\n"+"net amount to pay"+netAmount);
		s.close();
	}
}
