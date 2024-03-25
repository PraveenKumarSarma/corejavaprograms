import java.util.HashMap;
import java.util.Map;

public class FindRepeatedOddNumbers {

    public static void main(String[] args) {
        // Sample list of numbers
        int[] numbers = {1, 2, 5, 5, 7, 7, 7};

        // Create a HashMap to store occurrences
        Map<Integer, Integer> occurrences = new HashMap<>();

        // Count occurrences of each number
        for (int number : numbers) {
            if (occurrences.containsKey(number)) {
                occurrences.put(number, occurrences.get(number) + 1);
            } else if (number % 2 != 0) { // Check if odd
                occurrences.put(number, 1);
            }
        }

        // Find and print repeated odd numbers
        boolean foundRepeated = false;
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getKey() % 2 != 0 && entry.getValue() > 1) {
                foundRepeated = true;
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
            }
        }

        if (!foundRepeated) {
            System.out.println("No repeated odd numbers found.");
        }
    }
}
