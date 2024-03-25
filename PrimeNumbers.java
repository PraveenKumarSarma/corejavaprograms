public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0, num = 2;

        System.out.println("First 25 prime numbers:");

        while (count < 25) {
            boolean isPrime = true;

            // Check for divisibility from 2 to the square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++; // Move to the next number
        }
    }
}
