class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        return maxProfitHelper(prices, 0, prices.length - 1);
    }
    
    public int maxProfitHelper (int[] prices, int l, int r) {
        if (r == l) return 0;
        if (r == l + 1) {
            if (prices[l] < prices[r]) return prices[r] - prices[l];
            else return 0;
        }
        
        int mid = l + (r - l) / 2;
        int leftMax = maxProfitHelper(prices, l, mid);
        int rightMax = maxProfitHelper(prices, mid + 1, r);
        
        // min is in [l, mid], max is in [mid+1, r];
        
        // find min
        int minVal = prices[l];
        for (int i = l + 1; i <= mid; i++) {
            if (prices[i] < minVal) {
                minVal = prices[i];
            }
        }
        
        int maxVal = prices[mid+1];
        for (int i = mid + 2; i <= r; i++) {
            if (prices[i] > maxVal) {
                maxVal = prices[i];
            }
        }
        int crossDiff = maxVal - minVal;
        return Math.max(leftMax, Math.max(rightMax, crossDiff));
    }
}