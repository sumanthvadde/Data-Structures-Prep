class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
       
        backtrack(candidates,tempList,target,0,result);
        
        return result;
        
    }
    
    public void backtrack(int[] candidates, List<Integer> tempList, int target, int start,List<List<Integer>> result){
        if(target == 0 ) result.add(new ArrayList<>(tempList));
        else if(target < 0) return;
        else{
        for(int i=start; i<candidates.length; i++){
            tempList.add(candidates[i]);
            backtrack(candidates,tempList,target-candidates[i],i,result);
            tempList.remove(tempList.size() -1);
        }
    }}
}