import java.util.Scanner;

public class FinancialForecast {
    public static double forecast(double principal, double rate, int years) {
        return principal * Math.pow(1 + rate, years);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (as decimal, e.g., 0.05 for 5%): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double result = forecast(principal, rate, years);
        System.out.println("Future value after " + years + " years: " + result);
    }
}
