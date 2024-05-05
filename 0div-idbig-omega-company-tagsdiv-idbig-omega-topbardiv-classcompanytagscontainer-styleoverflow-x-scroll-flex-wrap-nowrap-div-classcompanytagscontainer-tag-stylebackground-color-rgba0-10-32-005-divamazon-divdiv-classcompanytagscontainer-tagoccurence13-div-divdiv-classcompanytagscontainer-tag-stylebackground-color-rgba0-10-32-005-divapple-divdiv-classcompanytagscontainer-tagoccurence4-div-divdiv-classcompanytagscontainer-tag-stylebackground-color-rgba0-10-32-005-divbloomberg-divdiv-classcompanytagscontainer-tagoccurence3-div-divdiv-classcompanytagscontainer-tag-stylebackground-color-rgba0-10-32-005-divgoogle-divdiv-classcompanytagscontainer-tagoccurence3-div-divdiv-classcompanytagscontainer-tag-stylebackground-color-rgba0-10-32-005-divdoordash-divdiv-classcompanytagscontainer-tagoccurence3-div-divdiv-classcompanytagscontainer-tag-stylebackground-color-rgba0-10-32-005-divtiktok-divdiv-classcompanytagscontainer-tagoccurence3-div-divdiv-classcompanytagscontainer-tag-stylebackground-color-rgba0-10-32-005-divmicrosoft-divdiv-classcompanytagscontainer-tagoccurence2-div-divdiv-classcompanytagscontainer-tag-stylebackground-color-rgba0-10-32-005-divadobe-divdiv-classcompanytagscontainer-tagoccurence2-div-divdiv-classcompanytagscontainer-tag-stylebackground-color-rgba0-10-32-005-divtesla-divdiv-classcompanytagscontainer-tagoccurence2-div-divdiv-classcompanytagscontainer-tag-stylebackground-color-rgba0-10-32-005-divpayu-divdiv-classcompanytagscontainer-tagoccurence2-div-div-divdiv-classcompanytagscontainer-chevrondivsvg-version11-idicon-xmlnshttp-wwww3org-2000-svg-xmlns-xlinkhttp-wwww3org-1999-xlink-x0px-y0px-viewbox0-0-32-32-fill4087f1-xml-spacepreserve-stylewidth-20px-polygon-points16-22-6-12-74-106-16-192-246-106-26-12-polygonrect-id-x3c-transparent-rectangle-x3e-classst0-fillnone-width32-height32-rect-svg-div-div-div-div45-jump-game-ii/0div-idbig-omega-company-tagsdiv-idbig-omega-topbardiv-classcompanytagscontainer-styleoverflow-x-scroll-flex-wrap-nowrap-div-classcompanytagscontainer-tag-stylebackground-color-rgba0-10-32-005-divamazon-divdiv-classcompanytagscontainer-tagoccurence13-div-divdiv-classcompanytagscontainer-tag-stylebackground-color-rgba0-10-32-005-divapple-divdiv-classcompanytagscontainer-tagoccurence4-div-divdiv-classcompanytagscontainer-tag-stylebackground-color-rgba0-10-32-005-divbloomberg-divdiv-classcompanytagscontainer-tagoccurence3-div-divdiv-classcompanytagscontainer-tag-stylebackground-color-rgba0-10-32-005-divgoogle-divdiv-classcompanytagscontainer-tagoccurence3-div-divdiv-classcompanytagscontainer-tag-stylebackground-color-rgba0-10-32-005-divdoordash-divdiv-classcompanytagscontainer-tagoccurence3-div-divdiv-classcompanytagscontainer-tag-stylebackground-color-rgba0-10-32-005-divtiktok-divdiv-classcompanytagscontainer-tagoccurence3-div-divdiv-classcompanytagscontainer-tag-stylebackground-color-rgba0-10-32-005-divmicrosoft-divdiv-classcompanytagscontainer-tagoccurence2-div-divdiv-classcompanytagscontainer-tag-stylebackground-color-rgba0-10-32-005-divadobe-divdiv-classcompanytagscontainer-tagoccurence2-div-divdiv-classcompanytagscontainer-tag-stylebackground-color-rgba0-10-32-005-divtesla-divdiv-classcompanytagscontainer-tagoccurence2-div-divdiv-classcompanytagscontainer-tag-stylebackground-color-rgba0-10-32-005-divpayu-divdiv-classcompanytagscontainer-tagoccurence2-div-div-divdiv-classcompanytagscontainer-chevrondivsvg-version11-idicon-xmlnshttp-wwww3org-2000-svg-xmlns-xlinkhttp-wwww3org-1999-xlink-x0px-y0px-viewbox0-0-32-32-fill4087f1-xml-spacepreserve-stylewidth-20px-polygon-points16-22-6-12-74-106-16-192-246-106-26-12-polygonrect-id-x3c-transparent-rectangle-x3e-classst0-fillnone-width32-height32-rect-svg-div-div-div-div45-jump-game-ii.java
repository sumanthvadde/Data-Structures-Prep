class Solution {
    public int jump(int[] nums) {
         int n = nums.length;

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int level=0;
        Boolean visited[]= new Boolean[n];
         while (!q.isEmpty()) {
             int size=q.size();
            
             for(int i=0;i<size;i++)
             {
                  int node = q.poll();
                 
                  if(node==n-1) return level;
                  
                int k=Math.min(node+nums[node],n-1);
                      for(int j=node+1;j<=k;j++)
                      {
                          if( visited[j]==null)
                          { visited[j]=true;
                              q.offer(j);

                          }
                      }
                  
             }
              level++;
    }
    return level;
}
}

