package LeetCode;

public class BuySellStockII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxProfit(int[] prices) {
        int profit=0;
        if(prices.length <= 0) return profit; 
        for(int i=0;i<prices.length-1;i++){
        	if(prices[i+1]-prices[i] >0)
        		profit+=prices[i+1]-prices[i];
        }
		return profit;
    }

}
