

/*  Mini-project 1 : Stock Analyzer →  finding max profit from stock prices with one buy & one sell.
    Backtester part: store Tesla daily prices in an array, scan through to calculate returns.
    Both use arrays for price handling.

    we are given an array of stock prices (daily closing prices).
    we need to determine the maximum profit we can achieve from a single buy 
    and a single sell (buy before sell).
    If you buy at a low price and later sell at a higher price, the difference = your profit per share.
    
    eg: Prices = [7, 1, 5, 3, 6, 4] array of stock prices over days. DAY 1 price 7$, DAY 2 Price 1$
    •   Lowest price = 1 (Day 2).
    •   Later high = 6 (Day 5).
    •   Profit per share = 6 − 1 = 5.
    user asking question: What is the maximum profit I could have made from exactly one trade during this period?

    why this matters: 
    It teaches the core intuition of Trading:  Scan prices --> Spot the lowest point to buy --> Spot the best later point to sell.


*/

public abstract class AbstractStockAnalyzer<T>implements AnalyzerInterface<T>{    //<T> generaics concept
    // Check if prices array is valid
    protected void validatePrices(int[] prices) {
        if (prices == null || prices.length < 2) {
            throw new IllegalArgumentException("Need at least 2 prices to analyze.");
        }
    }

}
