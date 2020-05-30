class CoinChange
{

	public static int count(int[] S, int n, int N)
	{
		
		if (N == 0) {
			return 1;
		}
		if (N < 0 || n < 0) {
			return 0;
		}

	
		int incl = count(S, n, N - S[n]);
		int excl = count(S, n - 1, N);
		return incl + excl;
	}

	
	public static void main(String[] args)
	{
		
		int[] S = { 1, 2, 3 };
		int N = 4;

		System.out.print("Total number of ways to get desired change is "
								+ count(S, S.length - 1, N));
	}
}