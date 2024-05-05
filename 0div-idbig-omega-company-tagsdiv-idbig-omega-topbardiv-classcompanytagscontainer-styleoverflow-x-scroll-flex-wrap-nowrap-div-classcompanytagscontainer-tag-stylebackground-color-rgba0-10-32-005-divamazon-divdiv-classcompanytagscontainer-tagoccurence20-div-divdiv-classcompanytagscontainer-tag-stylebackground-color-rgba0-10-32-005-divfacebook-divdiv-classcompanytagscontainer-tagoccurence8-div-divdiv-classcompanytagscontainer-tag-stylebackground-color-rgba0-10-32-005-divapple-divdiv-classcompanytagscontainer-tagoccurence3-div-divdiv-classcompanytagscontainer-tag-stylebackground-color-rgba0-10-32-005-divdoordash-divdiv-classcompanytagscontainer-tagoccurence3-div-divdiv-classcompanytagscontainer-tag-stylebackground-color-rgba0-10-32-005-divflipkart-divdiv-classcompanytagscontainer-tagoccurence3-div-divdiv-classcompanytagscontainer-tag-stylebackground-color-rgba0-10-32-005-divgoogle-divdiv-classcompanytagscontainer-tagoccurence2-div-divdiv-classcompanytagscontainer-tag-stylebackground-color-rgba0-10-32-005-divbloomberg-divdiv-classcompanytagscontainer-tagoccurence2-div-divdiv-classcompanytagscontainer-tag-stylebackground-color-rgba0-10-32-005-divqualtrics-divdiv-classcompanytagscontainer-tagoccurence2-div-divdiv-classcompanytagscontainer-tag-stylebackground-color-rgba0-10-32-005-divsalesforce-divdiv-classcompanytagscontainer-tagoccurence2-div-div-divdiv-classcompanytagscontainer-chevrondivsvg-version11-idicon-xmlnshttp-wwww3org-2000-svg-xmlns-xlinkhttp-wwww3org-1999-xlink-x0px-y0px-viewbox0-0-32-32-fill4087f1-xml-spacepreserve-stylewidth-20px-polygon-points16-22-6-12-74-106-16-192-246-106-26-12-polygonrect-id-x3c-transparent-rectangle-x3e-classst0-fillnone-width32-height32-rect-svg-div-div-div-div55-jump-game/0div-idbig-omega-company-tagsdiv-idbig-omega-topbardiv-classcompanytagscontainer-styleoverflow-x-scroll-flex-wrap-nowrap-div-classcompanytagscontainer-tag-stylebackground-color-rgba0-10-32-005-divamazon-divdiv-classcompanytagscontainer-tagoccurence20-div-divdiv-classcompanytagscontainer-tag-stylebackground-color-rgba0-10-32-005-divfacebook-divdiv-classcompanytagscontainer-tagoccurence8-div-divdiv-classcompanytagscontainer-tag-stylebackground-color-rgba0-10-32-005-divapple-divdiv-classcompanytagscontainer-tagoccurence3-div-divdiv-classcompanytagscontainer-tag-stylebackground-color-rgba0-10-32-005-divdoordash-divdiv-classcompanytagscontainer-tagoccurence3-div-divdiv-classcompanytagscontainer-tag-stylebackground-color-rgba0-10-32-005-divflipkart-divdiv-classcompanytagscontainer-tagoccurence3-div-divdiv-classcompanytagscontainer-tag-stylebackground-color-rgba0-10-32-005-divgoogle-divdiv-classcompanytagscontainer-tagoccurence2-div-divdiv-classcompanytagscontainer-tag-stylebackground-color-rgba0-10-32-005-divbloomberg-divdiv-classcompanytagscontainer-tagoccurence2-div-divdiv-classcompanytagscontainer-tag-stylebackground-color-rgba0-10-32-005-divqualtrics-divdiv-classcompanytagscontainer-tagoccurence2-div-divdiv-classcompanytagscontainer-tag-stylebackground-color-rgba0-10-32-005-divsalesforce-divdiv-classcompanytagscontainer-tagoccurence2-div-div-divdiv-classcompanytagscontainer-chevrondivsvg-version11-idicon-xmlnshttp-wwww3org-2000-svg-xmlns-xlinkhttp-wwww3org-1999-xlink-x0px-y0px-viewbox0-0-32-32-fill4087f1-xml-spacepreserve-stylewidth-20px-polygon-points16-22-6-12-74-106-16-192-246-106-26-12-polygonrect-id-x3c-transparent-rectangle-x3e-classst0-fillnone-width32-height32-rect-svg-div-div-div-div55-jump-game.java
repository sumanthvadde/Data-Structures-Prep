
class Solution{
    public boolean canJump(int[] nums){
        int lastGoodPosition = nums.length -1;
        for(int i = nums.length-1; i>=0; i--){
            if(i+nums[i] >= lastGoodPosition){
                lastGoodPosition = i;
            }
        }
        return lastGoodPosition == 0;
    }
}