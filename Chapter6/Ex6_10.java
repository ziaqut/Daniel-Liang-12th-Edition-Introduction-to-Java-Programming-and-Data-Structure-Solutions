package Chapter6;

public class Ex6_10 {
    public static void main(String[] args) {

    }
	public static boolean isPrime(int num) {
        for (int div = 2;div <= num / 2 ; div++) {
            if (num % div == 0) {
                return false
            }
        }
        return true;
    }
}
