
class Solution {
    public int solve(int[] prices, int fee, int i, int value, int[][] dp){
        if(i == prices.length) return 0;
        if(dp[i][value] != -1) return dp[i][value];
        if(value == 1) return dp[i][value] = Math.max(-prices[i] - fee + solve(prices,fee,i+1,0,dp), 0 + solve(prices,fee,i+1,1,dp));
        
        else
            return dp[i][value] = Math.max(prices[i]+solve(prices,fee,i+1,1,dp), 0 + solve(prices,fee,i+1,0,dp));
    }
    
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return solve(prices,fee,0,1,dp);
    }
}