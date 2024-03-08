package Chapter5;

public class Ex5_20 {
    // display prime number 2 to 1000
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.printf("%-10d", i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If the number is divisible by any other number, it's not prime
            }
        }
        return true;
    }
}
