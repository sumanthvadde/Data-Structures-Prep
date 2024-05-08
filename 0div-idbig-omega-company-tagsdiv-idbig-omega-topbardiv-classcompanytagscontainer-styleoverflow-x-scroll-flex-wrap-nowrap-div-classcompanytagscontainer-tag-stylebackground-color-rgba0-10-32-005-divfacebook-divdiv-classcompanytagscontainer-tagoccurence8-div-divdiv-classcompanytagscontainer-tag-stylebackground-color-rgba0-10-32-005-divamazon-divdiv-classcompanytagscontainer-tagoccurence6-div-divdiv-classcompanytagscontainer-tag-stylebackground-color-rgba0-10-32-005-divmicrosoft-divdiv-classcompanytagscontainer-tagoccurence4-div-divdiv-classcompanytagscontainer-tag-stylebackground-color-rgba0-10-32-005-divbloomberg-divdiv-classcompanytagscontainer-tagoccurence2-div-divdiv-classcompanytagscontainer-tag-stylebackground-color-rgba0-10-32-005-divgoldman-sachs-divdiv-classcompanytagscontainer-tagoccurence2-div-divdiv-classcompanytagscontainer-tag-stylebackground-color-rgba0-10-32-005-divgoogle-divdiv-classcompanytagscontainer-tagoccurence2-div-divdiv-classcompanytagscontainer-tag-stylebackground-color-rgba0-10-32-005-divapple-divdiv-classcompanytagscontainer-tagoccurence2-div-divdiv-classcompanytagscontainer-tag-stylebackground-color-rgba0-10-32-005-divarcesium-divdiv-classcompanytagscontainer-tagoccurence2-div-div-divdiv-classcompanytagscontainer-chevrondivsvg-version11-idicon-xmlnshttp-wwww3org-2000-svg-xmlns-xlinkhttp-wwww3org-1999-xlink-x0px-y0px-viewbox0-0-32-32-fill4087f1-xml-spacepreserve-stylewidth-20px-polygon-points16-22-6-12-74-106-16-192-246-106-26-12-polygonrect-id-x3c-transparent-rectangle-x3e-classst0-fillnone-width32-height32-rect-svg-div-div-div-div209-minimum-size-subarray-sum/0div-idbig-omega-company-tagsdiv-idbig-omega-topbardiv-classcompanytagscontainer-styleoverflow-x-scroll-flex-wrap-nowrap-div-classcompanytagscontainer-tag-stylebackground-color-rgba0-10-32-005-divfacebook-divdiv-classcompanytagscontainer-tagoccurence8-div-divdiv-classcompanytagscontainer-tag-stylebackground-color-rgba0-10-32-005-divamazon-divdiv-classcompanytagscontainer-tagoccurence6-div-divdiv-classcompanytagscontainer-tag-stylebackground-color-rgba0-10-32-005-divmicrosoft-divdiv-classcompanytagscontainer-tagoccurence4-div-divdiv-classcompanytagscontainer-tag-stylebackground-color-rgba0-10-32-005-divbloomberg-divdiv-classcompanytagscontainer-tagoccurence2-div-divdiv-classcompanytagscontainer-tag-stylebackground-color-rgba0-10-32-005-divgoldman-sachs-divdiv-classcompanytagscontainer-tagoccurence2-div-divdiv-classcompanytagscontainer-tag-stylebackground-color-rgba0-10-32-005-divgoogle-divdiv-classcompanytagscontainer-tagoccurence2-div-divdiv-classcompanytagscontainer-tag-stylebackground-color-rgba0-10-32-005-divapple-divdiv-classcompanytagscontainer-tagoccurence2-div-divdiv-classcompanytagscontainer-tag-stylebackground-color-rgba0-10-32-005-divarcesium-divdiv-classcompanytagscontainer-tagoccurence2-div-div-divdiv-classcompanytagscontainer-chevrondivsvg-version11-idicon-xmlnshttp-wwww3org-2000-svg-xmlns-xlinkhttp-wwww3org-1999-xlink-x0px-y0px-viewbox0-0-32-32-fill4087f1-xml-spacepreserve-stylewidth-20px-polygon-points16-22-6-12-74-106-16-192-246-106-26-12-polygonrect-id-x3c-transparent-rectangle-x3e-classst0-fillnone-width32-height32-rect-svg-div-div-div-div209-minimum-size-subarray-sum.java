class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int right =0;
        int min = Integer.MAX_VALUE;
        int sum=0;

        while(right<nums.length){
            if(sum < target){
                sum+=nums[right];
                //System.out.println(left + " " + right + " "+ sum);
            }
            else{
                sum+=nums[right];
                while(sum>= target){
                
               // System.out.println(left + " " + right + " "+ sum);
                    min = Math.min(right - left + 1, min);
                    if((sum - nums[left]) >= target)
                    {
                        sum-= nums[left++];
                    }
                    else
                        break;
                }
            }
            while(sum>= target){
                //System.out.println(left + " " + right + " "+ sum);
                min = Math.min(right - left + 1, min);
                if((sum - nums[left]) >= target)
                {
                    sum-= nums[left++];
                }
                else
                    break;
            }
            right++;
        }

        if(min == Integer.MAX_VALUE)
            return 0;
        return min;
        
    }
}