class ShortestCommonSuperSequence
{
	public static String SCS(String X, String Y, int m, int n, int[][] T)
	{
		if (m == 0) {
			return Y.substring(0, n);
		}

		else if (n == 0) {
			return X.substring(0, m);
		}


		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			return SCS(X, Y, m - 1, n - 1, T) + X.charAt(m - 1);
		}
		else
		{

			if (T[m - 1][n] > T[m][n - 1]) {
				return SCS(X, Y, m - 1, n, T) + X.charAt(m - 1);
			}

			else {
				return SCS(X, Y, m, n - 1, T) + Y.charAt(n - 1);
			}
		}
	}

	public static void LCS(String X, String Y, int m, int n, int[][] T)
	{
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					T[i][j] = T[i - 1][j - 1] + 1;
				}
				else {
					T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		String X = "ABCBDAB", Y = "BDCABA";
		int m = X.length(), n = Y.length();

		
		int[][] T = new int[m + 1][n + 1];
		LCS(X, Y, m, n, T);
		System.out.print("The Shortest Common Supersequence of " + X +
				" and " + Y + " is " + SCS(X, Y, m, n, T));
	}
}