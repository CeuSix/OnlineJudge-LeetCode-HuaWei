package LeetCode;

public class BuySellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxProfit(int[] prices) {
        int profit=0;
        if(prices.length <=0) return profit;
        int minPrice=prices[0];
        for(int i=0;i<prices.length;i++){
        	profit=prices[i]-minPrice>profit?prices[i]-minPrice:profit;
        	minPrice=prices[i]<minPrice?prices[i]:minPrice;
        }
		return profit;
    }
}
