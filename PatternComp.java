import java.util.*;
public class PatternComp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
		// i loop : iterating n times
        for (int row = 1; row <= n; row++)
        {
            int c = 1; // for printing the pattern
            // Printing spaces
        	// j loop : iterating n-i times
            for (int i= 1; i <= n-row; i++)
                System.out.print(" "); 
        	// j loop : iterating i times
            for (int j = 1; j <= row; j++)
            {
                // Printing the numbers
                System.out.print(c + " "); 
                c = c * (i - j) / j;
            }
            System.out.println();
        }
    }
}
