import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Arrays;

class Node
{
	int x;				
	int y;				
	int distance;		

	Node(int x, int y, int distance) {
		this.x = x;
		this.y = y;
		this.distance = distance;
	}
}

class LandMine
{
	
	private static final int M = 6;
	private static final int N = 5;

	private static boolean isValid(int i, int j)
	{
		return (i >= 0 && i < M) && (j >= 0 && j < N);
	}

	private static boolean isSafe(int i, int j, char[][] mat, int[][] result)
	{
		return mat[i][j] == 'O' && result[i][j] == -1;
	}


	private static void updateDistance(char[][] mat, int[][] result)
	{
		
		Queue<Node> Q = new ArrayDeque<>();

		
		for (int i = 0; i < M; i++)
		{
			for (int j = 0; j < N; j++)
			{
				
				if (mat[i][j] == 'M')
				{
					Q.add(new Node(i, j, 0));

					
					result[i][j] = 0;
				}
				
				else result[i][j] = -1;
			}
		}

		
		int[] R = { 0, -1, 0, 1 };
		int[] C = { -1, 0, 1, 0 };

		while (!Q.isEmpty())
		{
			
			int x = Q.peek().x;
			int y = Q.peek().y;
			int distance = Q.peek().distance;

			
			Q.poll();

			
			for (int i = 0; i < 4; i++)
			{
				
				if (isValid(x + R[i], y + C[i]) && isSafe(x + R[i], y + C[i], mat, result))
				{
					result[x + R[i]][y + C[i]] = distance + 1;
					Q.add(new Node(x + R[i], y + C[i], distance + 1));
				}
			}
		}
	}
	public static void main(String[] args)
	{
		char[][] mat =
		{
			{'O', 'M', 'O', 'O', 'X'},
			{'O', 'X', 'X', 'O', 'M'},
			{'O', 'O', 'O', 'O', 'O'},
			{'O', 'X', 'X', 'X', 'O'},
			{'O', 'O', 'M', 'O', 'O'},
			{'O', 'X', 'X', 'M', 'O'}
		};

		int[][] result = new int[M][N];
		updateDistance(mat, result);

		
		for (var r: result) {
			System.out.println(Arrays.toString(r));
		}
	}
}