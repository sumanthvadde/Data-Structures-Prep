// Given a matrix with negative value and convert it into all +ve value matrix using mimimum passes

import java.util.ArrayDeque;
import java.util.Queue;
class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MinimumPass
{
	
	private static int M, N;

	private static boolean isValid(int i, int j) {
		return (i >= 0 && i < M) && (j >= 0 && j < N);
	}

	
	private static int[] row = { -1, 0, 0, 1 };
	private static int[] col = { 0, -1, 1, 0 };

	private static boolean hasNegative(int mat[][])
	{
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0)
					return true;
			}
		}

		return false;
	}


	public static int convert(int mat[][])
	{
		
		Queue<Point> Q = new ArrayDeque<>();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0)
					Q.add(new Point(i,j));
			}
		}


		int passes = 0;

		while (!Q.isEmpty())
		{
		
			Queue<Point> q;
			q = new ArrayDeque<>(Q);
			Q.clear();


			while (!q.isEmpty())
			{
				
				int x = q.peek().x;
				int y = q.peek().y;
				q.poll();

				
				for (int k = 0; k < 4; k++)
				{
			
					if (isValid(x + row[k], y + col[k]) &&
								mat[x + row[k]][y + col[k]] < 0)
					{
						
						mat[x + row[k]][y + col[k]] = -mat[x + row[k]][y + col[k]];
						Q.add(new Point(x + row[k], y + col[k]));
					}
				}
			}


			passes++;
		}

		return hasNegative(mat) ? Integer.MAX_VALUE : (passes - 1);
	}

	public static void main(String[] args)
	{
		int[][] mat =
		{
			{ -1, -9, 0, -1, 0 },
			{ -8, -3, -2, 9, -7 },
			{ 2, 0, 0, -6, 0 },
			{ 0, -7, -3, 5, -4 }
		};

		M = mat.length;
		N = mat[0].length;

		int pass = convert(mat);
		if (pass != Integer.MAX_VALUE) {
			System.out.print("No of passes required is " + pass);
		}
		else {
			System.out.print("Invalid Input");
		}
	}
}