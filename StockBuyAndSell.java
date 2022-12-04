public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int max = Integer.MAX_VALUE;
        int result = 0;
        int maxDiff = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < max){
                max = prices[i];
            }
            maxDiff = prices[i] - max;
            if(result < maxDiff){
                result = maxDiff;
            }
        }
        return result;
    }
}
