class Solution {
    public int maxAbsoluteSum(int[] nums){
        int result = 0;
        int max_sum =0;
        int min_sum =0;
        for(var n : nums){
            max_sum = Math.max(0, n+max_sum);
            min_sum = Math.min(0, n + min_sum);
            result = Math.max(result, Math.max(max_sum, -min_sum));
        }
        return result;
    }
}