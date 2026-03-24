class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int totalMax = 0;
        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                int total = prices[right] - prices[left];
                if(total > totalMax) 
                    totalMax = total; 
            } else {
                left = right;
            }
            right++;
        }
        return totalMax;
    }
}
