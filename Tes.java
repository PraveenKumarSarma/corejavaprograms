import java.util.Scanner;
class Tes
{
	public static void main(String[] args) 
	{
		int[] num ={10,20,30,40,50};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first index");
		int first = s.nextInt();
		System.out.println("Enter the second index");
		int second = s.nextInt();
		if(first < 0 || second < 0 ||first >= num.length || second >= num.length)
		{
			System.out.println("Entered index value is invalid");
		}
		
		else
		{
			int temp = num[first];
			num[first] = num[second];
			num[second] = temp;

		}
		System.out.println("after swapping");
		for(int n:num)
		{
			System.out.print(n+" ");
		}		

	}
}