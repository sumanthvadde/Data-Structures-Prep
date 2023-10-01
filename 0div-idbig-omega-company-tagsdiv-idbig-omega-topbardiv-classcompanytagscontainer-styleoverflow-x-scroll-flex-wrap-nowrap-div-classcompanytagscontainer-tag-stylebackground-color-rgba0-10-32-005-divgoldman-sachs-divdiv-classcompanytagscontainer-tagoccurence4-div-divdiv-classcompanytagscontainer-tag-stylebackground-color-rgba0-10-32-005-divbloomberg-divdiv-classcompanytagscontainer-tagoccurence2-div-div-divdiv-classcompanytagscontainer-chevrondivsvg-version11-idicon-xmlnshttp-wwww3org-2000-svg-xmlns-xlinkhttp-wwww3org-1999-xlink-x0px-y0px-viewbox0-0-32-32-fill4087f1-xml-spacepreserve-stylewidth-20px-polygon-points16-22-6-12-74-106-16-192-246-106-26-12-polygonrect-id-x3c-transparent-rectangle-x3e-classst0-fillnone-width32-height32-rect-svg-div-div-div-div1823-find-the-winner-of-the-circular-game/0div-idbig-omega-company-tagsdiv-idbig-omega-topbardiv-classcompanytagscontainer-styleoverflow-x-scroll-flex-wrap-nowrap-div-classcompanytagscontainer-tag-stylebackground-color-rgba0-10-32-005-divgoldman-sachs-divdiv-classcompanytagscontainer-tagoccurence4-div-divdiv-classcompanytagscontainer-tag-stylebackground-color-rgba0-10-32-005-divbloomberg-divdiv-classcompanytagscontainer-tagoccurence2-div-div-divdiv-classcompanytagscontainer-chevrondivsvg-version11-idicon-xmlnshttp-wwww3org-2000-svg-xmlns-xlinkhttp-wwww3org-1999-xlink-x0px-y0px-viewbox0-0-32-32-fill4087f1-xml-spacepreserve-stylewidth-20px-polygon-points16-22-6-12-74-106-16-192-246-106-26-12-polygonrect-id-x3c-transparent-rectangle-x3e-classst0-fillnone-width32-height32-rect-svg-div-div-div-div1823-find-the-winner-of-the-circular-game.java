

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> arr = new LinkedList<>();
        for(int i=1; i<=n; i++){
            arr.add(i);
        }

        while(arr.size() != 1){
            for(int i=k-1; i>0; i--){
                arr.add(arr.poll());
            }
            arr.poll();
        }
        return arr.poll();
    }
}