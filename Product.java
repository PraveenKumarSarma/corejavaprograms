import java.util.Scanner;
class Product 
{
	public static void main(String[] args) 
	{

		//create scanner object
		Scanner a = new Scanner(System.in);


        //Read data from command prompt
		System.out.println("Enter product name");
		String pname = a.next();

		System.out.println("Enter price of product");
		double price = a.nextDouble();

		System.out.println("Enter quantity reqd");
		int qty = a.nextInt();

        //close the scanner object
		a.close();

		double totalPrice;
		totalPrice= price * qty;

		double discount,netAmt;

		if(totalPrice > 1000)
		{
			discount = totalPrice*0.2;
			netAmt = totalPrice-discount;
			System.out.println("product name is..."+pname);
			System.out.println("price of product is..."+price);
			System.out.println("product qty reqd..."+qty);
			System.out.println("total price..."+totalPrice);
			System.out.println("discount amount..."+discount);
			System.out.println("net amount to pay..."+netAmt);
		}
		else
		{
			discount = totalPrice*0.1;
			netAmt = totalPrice-discount;
			System.out.println("product name is..."+pname);
			System.out.println("price of product is..."+price);
			System.out.println("product qty reqd..."+qty);
			System.out.println("total price..."+totalPrice);
			System.out.println("discount amount..."+discount);
			System.out.println("net amount to pay..."+netAmt);
		}


	}
}
