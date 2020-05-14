class RotatedPalindrome
{
	public static boolean isPalindrome(String str, int low, int high)
	{
		return (low >= high) || (str.charAt(low) == str.charAt(high) &&
								isPalindrome(str, low + 1, high - 1));
	}

	
	public static boolean isRotatedPalindrome(String str)
	{
		
		int m = str.length();

		
		for (int i = 0; i < m; i++)
		{
			// in-place rotate the string by 1 unit
			str = str.substring(1) + str.charAt(0);

			// return true if the rotation is a palindrome
			if (isPalindrome(str, 0, m - 1)) {
				return true;
			}
		}

		
		return false;
	}

	// Check if given string is a rotated palindrome or not
	public static void main(String[] args) {
		// palindromic string
		String str = "ABCDCBA";

		if (isRotatedPalindrome(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}