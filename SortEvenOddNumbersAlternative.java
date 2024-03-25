import java.util.Arrays;
import java.util.Scanner;

public class SortEvenOddNumbersAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] evenNumbers = new int[10];
        int[] oddNumbers = new int[10];
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[evenCount++] = num;
            } else {
                oddNumbers[oddCount++] = num;
            }
        }

        Arrays.sort(evenNumbers, 0, evenCount); // Sort even numbers in ascending order
        Arrays.sort(oddNumbers, 0, oddCount);  // Sort odd numbers in ascending order
        // Reverse odd numbers for descending order
        for (int i = 0; i < oddCount / 2; i++) {
            int temp = oddNumbers[i];
            oddNumbers[i] = oddNumbers[oddCount - i - 1];
            oddNumbers[oddCount - i - 1] = temp;
        }

        // Combine even and odd numbers into the original array
        int index = 0;
        for (int i = 0; i < evenCount; i++) {
            numbers[index++] = evenNumbers[i];
        }
        for (int i = 0; i < oddCount; i++) {
            numbers[index++] = oddNumbers[i];
        }

        System.out.println("Sorted numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
