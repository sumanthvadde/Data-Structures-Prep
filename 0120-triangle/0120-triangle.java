class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        int n = list.size();
        List<Integer> li = new ArrayList<>(list.get(n-1));
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                li.set(j, list.get(i).get(j) + Math.min( li.get(j), li.get(j+1) ));
            }
        }
        return li.get(0);
    }
}