class ShortestPath
{
	
	private static final int M = 10;
	private static final int N = 10;

	private static boolean isSafe(int mat[][], int visited[][], int x, int y)
	{
		return !(mat[x][y] == 0 || visited[x][y] != 0);
	}

	
	private static boolean isValid(int x, int y)
	{
		return (x < M && y < N && x >= 0 && y >= 0);
	}

	public static int findShortestPath(int mat[][], int visited[][], int i, int j, int x, int y, int min_dist, int dist)
	{
		
		if (i == x && j == y)
		{
			return Integer.min(dist, min_dist);
		}

		
		visited[i][j] = 1;

		
		if (isValid(i + 1, j) && isSafe(mat, visited, i + 1, j)) {
			min_dist = findShortestPath(mat, visited, i + 1, j, x, y, min_dist, dist + 1);
		}

		if (isValid(i, j + 1) && isSafe(mat, visited, i, j + 1)) {
			min_dist = findShortestPath(mat, visited, i, j + 1, x, y,
										min_dist, dist + 1);
		}

		
		if (isValid(i - 1, j) && isSafe(mat, visited, i - 1, j)) {
			min_dist = findShortestPath(mat, visited, i - 1, j, x, y,min_dist, dist + 1);
		}

		if (isValid(i, j - 1) && isSafe(mat, visited, i, j - 1)) {
			min_dist = findShortestPath(mat, visited, i, j - 1, x, y,min_dist, dist + 1);
		}

		visited[i][j] = 0;

		return min_dist;
	}

	public static void main(String[] args)
	{
		int mat[][] =
		{
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
				{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
		};

	
		int[][] visited = new int[M][N];

		int min_dist = findShortestPath(mat, visited, 0, 0, 7, 5,Integer.MAX_VALUE, 0);

		if(min_dist != Integer.MAX_VALUE) {
			System.out.println("The shortest path from source to destination "+ "has length " + min_dist);
		}
		else {
			System.out.println("Destination can't be reached from source");
		}
	}
}