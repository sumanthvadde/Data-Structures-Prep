class Solution {
    public int maxSumAfterPartitioning(int[] arr, int K) {
        int N = arr.length;
        int dp[] = new int[N+1];
        
        for(int i=1; i<=N;i++){
            int curMax =0;
            int best = 0;
            for(int k=1;k<=K && i-k >=0; k++){
                curMax = Math.max(curMax,arr[i-k]);
                best = Math.max(best, dp[i-k]+curMax*k);
            }
            dp[i] = best;
        }
        return dp[N];
    }
}