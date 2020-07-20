class MaxGold {
    int max = 0;
    public int getMaximumGold(int[][] grid) {
        for(int r=0; r<grid.length; r++)
        {
            for(int c=0; c<grid[r].length; c++)
            {
                if(grid[r][c] != 0)
                {
                    dfs(grid,r,c,0);
                }
            }
        }
        return max;
    }
    
    private void dfs(int[][] grid, int r, int c, int gold)
    {
        // error checking
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] == 0)
        {
            return;
        }
        
        // get the value in the cell (required to revert cell later)
        int cellValue = grid[r][c];
        
        // add value to the amount of gold already obtained
        gold += cellValue;
        
        // set cell to 0 so we don't recalc in this recursion (can cause cycle)
        grid[r][c] = 0;
        
        // search each of the 4 directions
        dfs(grid, r-1, c, gold);
        dfs(grid, r+1, c, gold);
        dfs(grid, r, c-1, gold);
        dfs(grid, r, c+1, gold);
        
        // find the max at this point
        max = Math.max(max, gold);
        
        // revert the cell
        grid[r][c] = cellValue;
    }
}