import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an English sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = 0, consonantCount = 0;
        sentence = sentence.toLowerCase();  // Convert to lowercase for case-insensitive counting

        for (char ch : sentence.toCharArray()) {
            if (isVowel(ch)) {
                vowelCount++;
            } else if (isConsonant(ch)) {
                consonantCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static boolean isConsonant(char ch) {
        return Character.isLetter(ch) && !isVowel(ch);
    }
}
