import java.util.Arrays;

class TotalPath
{
	private static final int N = 4;
	private static boolean isValidCell(int x, int y)
	{
		if (x < 0 || y < 0 || x >= N || y >= N)
			return false;

		return true;
	}

	private static int countPaths(int maze[][], int x, int y,boolean visited[][], int count)
	{
		if (x == N - 1 && y == N - 1)
		{
			count++;
			return count;
		}
		visited[x][y] = true;

		if (isValidCell(x, y) && maze[x][y] == 1)
		{

			if (x + 1 < N && !visited[x + 1][y])
				count = countPaths(maze, x + 1, y, visited, count);

			if (x - 1 >= 0 && !visited[x - 1][y])
				count = countPaths(maze, x - 1, y, visited, count);

			if (y + 1 < N && !visited[x][y + 1])
				count = countPaths(maze, x, y + 1, visited, count);

			if (y - 1 >= 0 && !visited[x][y - 1])
				count = countPaths(maze, x, y - 1, visited, count);
		}

		visited[x][y] = false;

		return count;
	}

	public static void main(String[] args)
	{
		int maze[][] =
		{
			{ 1, 1, 1, 1 },
			{ 1, 1, 0, 1 },
			{ 0, 1, 0, 1 },
			{ 1, 1, 1, 1 }
		};

		int count = 0;
		boolean[][] visited = new boolean[N][N];
		count = countPaths(maze, 0, 0, visited, count);

		System.out.println("Total number of unique paths are " + count);
	}
}