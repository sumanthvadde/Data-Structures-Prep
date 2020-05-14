class RotatedStr
{
	// Function to check if X can be derived from Y by rotating it
	public static boolean check(String X, String Y)
	{
		int m;
		if ((m = X.length()) != Y.length()) {
			return false;
		}

		for (int i = 0; i < m; i++)
		{
			
			X = X.substring(1) + X.charAt(0);
			if (X.compareTo(Y) == 0) {
				return true;
			}
		}

		
		return false;
	}

	public static void main(String[] args)
	{
		String X = "ABCD";
		String Y = "DABC";

		if (check(X, Y)) {
			System.out.println("Given Strings can be derived from each other");
		}
		else {
			System.out.println("Given Strings cannot be derived from each other");
		}
	}
}