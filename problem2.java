//best time to buy or sell stock - 121 leetcode
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int tempProfit = prices[i]-min;
            if(tempProfit>profit){
                profit=tempProfit;
            }
        }
        return profit;
    }
}
public class problem2
{
    
	public static void main(String[] args) {
	    Solution s = new Solution();
	    System.out.println(s.maxProfit(new int []{7,1,5,3,6,4}));
	}
}
