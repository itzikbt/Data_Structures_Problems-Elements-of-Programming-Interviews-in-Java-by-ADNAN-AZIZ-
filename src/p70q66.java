import java.util.List;

public class p70q66 {
    public static void main(String[] args) {

    }

    public static int buyAndSellStockOnce(List<Integer> stockPrices){
        if (stockPrices.isEmpty())
            return 0;
        int curMin = stockPrices.get(0), maxProfit = 0;
        for (int i = 1; i < stockPrices.size(); i++) {
            if (stockPrices.get(i) < curMin)
                curMin = stockPrices.get(i);
            else
                maxProfit = Math.max(stockPrices.get(i) - curMin, maxProfit);
        }
        return maxProfit;
    }

}
