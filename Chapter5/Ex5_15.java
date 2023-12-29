package Chapter5;

public class Ex5_15 {
    public static void main(String[] args) {
        int n = 7;
        int s = 1;
        for (int i = 7; i > 0 ; i--) {
            for (int j = 1; j<i ;j++) {
                System.out.print(" ");
            }
            for (int k = n; i<=k; k--) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
