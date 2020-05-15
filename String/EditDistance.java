class EditDistance
{

	public static int minimum(int a, int b, int c)
	{
		return Integer.min(a, Integer.min(b, c));
	}
	public static int dist(String X, int m, String Y, int n)
	{

		int[][] T = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++)
			T[i][0] = i;				

		for (int j = 1; j <= n; j++)
			T[0][j] = j;				

		int cost;

		// fill the lookup table in bottom-up 
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (X.charAt(i-1) == Y.charAt(j-1))     
					cost = 0;   						
				else
					cost = 1;   						

				T[i][j] = minimum(T[i - 1][j] + 1,  		// deletion (case 3b)
						T[i][j - 1] + 1,		// insertion (case 3a)
						T[i - 1][j - 1] + cost);	// replace (case 2 + 3c)
			}
		}

		return T[m][n];
	}

	
	public static void main(String[] args)
	{
		String X = "kitten", Y = "sitting";

		System.out.print("The Edit Distance is " +
				dist(X, X.length(), Y, Y.length()));
	}
}