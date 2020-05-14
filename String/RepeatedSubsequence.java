import java.util.HashMap;
import java.util.Map;

// Also LCS can be used to fetch the repeating subsequence


class RepeatedSubsequence
{
	public static boolean isPalindrome(String str, int low, int high)
	{
		
		if (low >= high) {
			return true;
		}

		return (str.charAt(low) == str.charAt(high)) &&
				isPalindrome(str, low + 1, high - 1);
	}

	public static boolean repeatedSubsequence(String str)
	{
		Map<Character, Integer> freq = new HashMap<>();

		// update map with frequency
		for (int i = 0; i < str.length(); i++)
		{

			if (freq.get(str.charAt(i)) == null){
				freq.put(str.charAt(i), 0);
			}

			freq.put(str.charAt(i), freq.get(str.charAt(i)) + 1);

			if (freq.get(str.charAt(i)) >= 3) {
				return true;
			}
		}

		StringBuilder sb = new StringBuilder() ;

		for (int i = 0; i < str.length(); i++) {
			if (freq.get(str.charAt(i)) >= 2) {
				sb.append(str.charAt(i));
			}
		}
		return !isPalindrome(sb.toString(), 0, sb.length() - 1);
	}

	public static void main(String[] args)
	{
		String str = "XYBYAXB";
		if (repeatedSubsequence(str))
			System.out.println("Repeated Subsequence present");
		else
			System.out.println("No Repeated Subsequence");
	}
}