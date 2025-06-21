public class FinancialForecast {
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
    }
    public static double calculateFutureValueMemo(double presentValue, double growthRate, int years, double[] memo) {
        if (years == 0) return presentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = (1 + growthRate) * calculateFutureValueMemo(presentValue, growthRate, years - 1, memo);
        return memo[years];
    }
}