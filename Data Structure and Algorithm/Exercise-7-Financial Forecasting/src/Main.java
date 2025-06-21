public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;
        System.out.println("--- Financial Forecast (Recursive) ---");
        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
        System.out.println("\n--- Financial Forecast (Memoized Recursive) ---");
        double[] memo = new double[years + 1];
        double futureMemo = FinancialForecast.calculateFutureValueMemo(presentValue, growthRate, years, memo);
        System.out.printf("Future Value with Memoization: %.2f\n", futureMemo);
    }
}