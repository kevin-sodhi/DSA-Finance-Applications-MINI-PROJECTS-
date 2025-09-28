//  custom class to hold more than one piece of information other than profit/share it also returns 1 and 2
public class MaxProfitResult {
    public final int maxProfit;
    public final int buyIndex;
    public final int sellIndex;

    public MaxProfitResult(int maxProfit, int buyIndex, int sellIndex) {
        this.maxProfit = maxProfit; // profit per share
        this.buyIndex = buyIndex;   //day index when we should buy.....1
        this.sellIndex = sellIndex; //day index when we should sell.....2
    }
}
