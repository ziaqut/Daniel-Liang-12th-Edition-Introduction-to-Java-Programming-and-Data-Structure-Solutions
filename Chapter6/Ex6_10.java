package Chapter6;

public class Ex6_10 {
    public static void main(String[] args) {

    }
    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count
            }
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%−5d\n", number);// Print the number and advance to the new line
				} else {
					System.out.printf("%-5d", number);
				}
			
}
