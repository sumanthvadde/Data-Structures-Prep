class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // Calculate the total sum to determine the size of the dp array needed
        int totalSum = 0;
        for (int num : nums) {
            totalSum += Math.abs(num); // Ensure positive sum for offset
        }
        
        // Adjusting the dp array to handle negative indices by offsetting with totalSum
        // Plus one is to include zero in our new range
        int[][] dp = new int[nums.length][2 * totalSum + 1];
        
        // Initialize dp array with a marker for uncomputed values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 2 * totalSum + 1; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        
        return helper(nums, 0, 0, target, dp, totalSum);
    }

    private int helper(int[] nums, int index, int curSum, int target, int[][] dp, int totalSum) {
        // Check if the current (index, sum) pair has been computed before
        if (index == nums.length) {
            if (curSum == target) {
                return 1; // Found a valid way
            } else {
                return 0; // Not a valid way
            }
        } else if (dp[index][curSum + totalSum] != Integer.MIN_VALUE) {
            // If computed before, directly return the stored result
            return dp[index][curSum + totalSum];
        }
        
        // Calculate the number of ways for both addition and subtraction
        int add = helper(nums, index + 1, curSum + nums[index], target, dp, totalSum);
        int subtract = helper(nums, index + 1, curSum - nums[index], target, dp, totalSum);
        
        // Store the computed result in dp array before returning
        dp[index][curSum + totalSum] = add + subtract;
        
        return dp[index][curSum + totalSum];
    }
}