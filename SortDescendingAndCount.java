import java.util.Arrays;

public class SortDescendingAndCount {

   public static void main(String[] args) {
       int[] numbers = {5, 3, 1, 7, 2, 4, 9, 6, 8, 0};  // Example list

       int comparisons = sortAndCount(numbers);

       System.out.println("Sorted numbers in descending order: ");
       Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));

       System.out.println("\nNumber of comparisons made: " + comparisons);
   }

   public static int sortAndCount(int[] numbers) {
       int comparisons = 0;

       for (int i = 0; i < numbers.length - 1; i++) {
           for (int j = i + 1; j < numbers.length; j++) {
               comparisons++;
               if (numbers[i] < numbers[j]) {
                   int temp = numbers[i];
                   numbers[i] = numbers[j];
                   numbers[j] = temp;
               }
           }
       }

       return comparisons;
   }
}
