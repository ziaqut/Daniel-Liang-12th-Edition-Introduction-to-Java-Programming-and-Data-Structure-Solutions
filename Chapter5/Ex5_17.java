package Chapter5;

import java.util.Scanner;
public class Ex5_17 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int numberOfLine = input.nextInt();

        for (int i = 1; i <= numberOfLine; i++) {
            for (int j = numberOfLine - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
