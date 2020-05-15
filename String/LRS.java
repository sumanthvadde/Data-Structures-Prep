class LRS
{
	
	public static int LRSLength(String X)
	{
		int n = X.length();
		int[][] T = new int[n + 1][n + 1];

		// fill the lookup table in bottom-up manner
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				
				if (X.charAt(i - 1) == X.charAt(j - 1) && i != j) {
					T[i][j] = T[i - 1][j - 1] + 1;
				}
				
				else {
					T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
				}
			}
		}

		// LRS will be last entry in the lookup table
		return T[n][n];
	}

	public static void main(String[] args)
	{
		String X = "ATACTCGGA";
		
		System.out.print("Length of Longest Repeating Subsequence is " +
				LRSLength(X));
	}
}