class LongestRoute
{
	
	private static final int M = 10;
	private static final int N = 10;

	private static boolean isSafe(int mat[][], int visited[][], int x, int y)
	{
		if (mat[x][y] == 0 || visited[x][y] != 0)
			return false;

		return true;
	}

	private static boolean isValid(int x, int y)
	{
		if (x < M && y < N && x >= 0 && y >= 0)
			return true;

		return false;
	}

	public static int findLongestPath(int mat[][], int visited[][], int i, int j, int x, int y, int max_dist, int dist)
	{

		if (mat[i][j] == 0) {
			return 0;
		}

		if (i == x && j == y)
		{
			return Integer.max(dist, max_dist);
		}


		visited[i][j] = 1;

		if (isValid(i + 1, j) && isSafe(mat, visited, i + 1, j)) {
			max_dist = findLongestPath(mat, visited, i + 1, j, x, y,max_dist, dist + 1);
		}

		
		if (isValid(i, j + 1) && isSafe(mat, visited, i, j + 1)) {
			max_dist = findLongestPath(mat, visited, i, j + 1, x, y,max_dist, dist + 1);
		}

		if (isValid(i - 1, j) && isSafe(mat, visited, i - 1, j)) {
			max_dist = findLongestPath(mat, visited, i - 1, j, x, y,
										max_dist, dist + 1);
		}

		
		if (isValid(i, j - 1) && isSafe(mat, visited, i, j - 1)) {
			max_dist = findLongestPath(mat, visited, i, j - 1, x, y,
										max_dist, dist + 1);
		}

		
		visited[i][j] = 0;

		return max_dist;
	}

	public static void main(String[] args)
	{
		
		int mat[][] =
		{
				{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
				{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
				{ 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }
		};

		int[][] visited= new int[N][N];


		int max_dist = findLongestPath(mat, visited, 0, 0, 7, 9, 0, 0);

		System.out.println("Maximum length path is " + max_dist);
	}
}