class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int rows = grid.size();
        int cols = grid.get(0).size();
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid.get(i).get(j) == 1){
                    if((i == 0 && j == 0) || (i == rows - 1 && j == cols - 1)){
                        return 0;
                    }
                    queue.offer(new int[]{i, j, 0});
                    visited[i][j] = true;
                }
            }
        }
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int[][] distance = new int[rows][cols];
        bfs(rows, cols, queue, distance, directions, visited);
        return maxFactor(0, 0, directions, distance, rows, cols);
    }

    private void bfs(int rows, int cols, Queue<int[]> queue, int[][] distance, int[][] directions, boolean[][] visited){
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[] current = queue.poll();
                int currentX = current[0];
                int currentY = current[1];
                int currentDistance = current[2];
                for(int[] dir : directions){
                    int nextX = currentX + dir[0];
                    int nextY = currentY + dir[1];
                    if(nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && !visited[nextX][nextY]){
                        visited[nextX][nextY] = true;
                        distance[nextX][nextY] = currentDistance + 1;
                        queue.offer(new int[]{nextX, nextY, currentDistance + 1});
                    }
                }
            }
        }
    }

    private int maxFactor(int row, int col, int[][] directions, int[][] distance, int rows, int cols){
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[2] == b[2]){
                    return 0;
                }
                return a[2] > b[2] ? -1 : 1;
            }
        });
        maxHeap.offer(new int[]{row, col, distance[row][col]});
        boolean[][] visited = new boolean[distance.length][distance[0].length];
        visited[row][col] = true;
        while(!maxHeap.isEmpty()){
            int size = maxHeap.size();
            for(int i = 0; i < size; i++){
                int[] current = maxHeap.poll();
                int currentX = current[0];
                int currentY = current[1];
                int currentDistance = current[2];
                if(currentX == distance.length - 1 && currentY == distance[0].length - 1){
                    return currentDistance;
                }
                for(int[] dir : directions){
                    int nextX = currentX + dir[0];
                    int nextY = currentY + dir[1];
                    if(nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && !visited[nextX][nextY]){
                        visited[nextX][nextY] = true;
                        maxHeap.offer(new int[]{nextX, nextY, Math.min(currentDistance, distance[nextX][nextY])});
                    }
                }
            }
        }
        return -1;
    }
}