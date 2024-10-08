package Chapter6;

public class Ex6_12 {

    public static double computeCommission(double salesAmount) {
        double commission = 0.0D;

        // Commission rate
        if (salesAmount <= 10000) {
            commission = salesAmount * 0.09;
        } else if (salesAmount <= 15000) {
            commission = 10000 * 0.09 + (salesAmount - 10000) * 0.12;
        } else {
            commission = 10000 * 0.09 + 5000 * 0.12 + (salesAmount - 15000) * 0.15;
        }

        return commission;
    }

    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "Sales Amount", "Commission");

        for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            double commission = computeCommission(salesAmount);
            System.out.printf("%-15.0f%-15.2f\n", salesAmount, commission);
        }
    }
}
