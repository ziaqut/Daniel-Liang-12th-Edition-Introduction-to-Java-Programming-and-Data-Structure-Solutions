package Chapter5;

public class Ex5_18 {
    public static void main(String[] args) {
        // Patern A
        int n = 5;
        // i implies number of rows
        // j implies the column
        /*
        System.out.println("Patern A");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        */
        /*
        // Patern B
        System.out.println("Patern B");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */
        System.out.println("Patern C");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
