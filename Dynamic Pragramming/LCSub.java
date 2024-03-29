class LCS
{
	public static String LCS(String X, String Y, int m, int n)
	{
		int maxlen = 0; 		
		int endingIndex = m;	

		int[][] lookup = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
		
				if (X.charAt(i - 1) == Y.charAt(j - 1))
				{
					lookup[i][j] = lookup[i - 1][j - 1] + 1;

					if (lookup[i][j] > maxlen)
					{
						maxlen = lookup[i][j];
						endingIndex = i;
					}
				}
			}
		}

		return X.substring(endingIndex - maxlen, endingIndex);
	}

	
	public static void main(String[] args)
	{
		String X = "ABC", Y = "BABA";
		int m = X.length(), n = Y.length();

		// Find Longest common substring
		System.out.print("The Longest common substring is "
						+ LCS(X, Y, m, n));
	}
}