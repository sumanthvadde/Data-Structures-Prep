



class Pair {
    int c;
    int p;
    Pair(int c, int p){
        this.c = c;
        this.p = p;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital){
        int n = profits.length;
        
        PriorityQueue<Pair> minCapitalHeap = new PriorityQueue<>(n, Comparator.comparingInt(a -> a.c));
        
        PriorityQueue<Pair> maxProfitHeap = new PriorityQueue<>(n, (a,b) -> b.p - a.p);
        
        for (int i = 0; i < n; i++) {
            minCapitalHeap.offer(new Pair(capital[i], profits[i]));
        }
        
        for (int i = 0; i < k; i++) {
            while (!minCapitalHeap.isEmpty() && minCapitalHeap.peek().c <= w) {
                maxProfitHeap.offer(minCapitalHeap.poll());
            }

            if (maxProfitHeap.isEmpty()) {
                break;
            }

            w += maxProfitHeap.poll().p;
        }

        return w;
    
    }
}