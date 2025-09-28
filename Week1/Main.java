


    public class Main {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        String[] dates = {
            "2024-01-01","2024-01-02","2024-01-03",
            "2024-01-04","2024-01-05","2024-01-06"
        }; // same length as prices

        AnalyzerInterface<MaxProfitResult> analyzer = new MaxProfitDetailAnalyzer();
        MaxProfitResult r = analyzer.analyze(prices);

        // safety if dates not aligned
        if (dates != null && dates.length == prices.length) {
            System.out.println(
                "Buy on " + dates[r.buyIndex] + " at " + prices[r.buyIndex] +
                " | Sell on " + dates[r.sellIndex] + " at " + prices[r.sellIndex] +
                " => Max Profit per share: " + r.maxProfit
            );
        } else {
            System.out.println(
                "Buy at index " + r.buyIndex + " (" + prices[r.buyIndex] + ")" +
                " | Sell at index " + r.sellIndex + " (" + prices[r.sellIndex] + ")" +
                " => Max Profit per share: " + r.maxProfit
            );
        }
    }
}

