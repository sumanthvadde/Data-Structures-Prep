class NumOfIslands {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length ==0) return 0;
        int count =0;
        for(int i =0; i< grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(int i, int j, char[][] grid){
        if(i<0||i>=grid.length ||j<0||j>=grid[0].length || grid[i][j]=='0') return;
        grid[i][j]='0';//meet 1, assign it to 0
        dfs(i-1,j,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i,j+1,grid);      
    }
}
