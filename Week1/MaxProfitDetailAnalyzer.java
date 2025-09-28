/*eg: Prices = [7, 1, 5, 3, 6, 4] array of stock prices over days. DAY 1 price 7$, DAY 2 Price 1$
    •   Lowest price = 1 (Day 2).
    •   Later high = 6 (Day 5).
    •   Profit per share = 6 − 1 = 5.
    user asking question: What is the maximum profit I could have made from exactly one trade during this period?
    */ 
public class MaxProfitDetailAnalyzer extends AbstractStockAnalyzer<MaxProfitResult> {

    @Override
    public MaxProfitResult analyze(int[] prices) {
        validatePrices(prices);  // goes to abstract clss to check 

        int minPrice = prices[0];
        int minIdx = 0;

        int bestProfit = 0;
        int bestBuy = 0;
        int bestSell = 1;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > bestProfit) {
                bestProfit = profit;
                bestBuy = minIdx;
                bestSell = i;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minIdx = i;
            }
        }
        return new MaxProfitResult(bestProfit, bestBuy, bestSell);
    }
}