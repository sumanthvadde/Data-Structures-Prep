import java.util.HashSet;
import java.util.Set;

class GenPalindromsSub
{
	
	public static void expand(String str, int low, int high, Set<String> set)
	{
		while (low >= 0 && high < str.length()
				&& str.charAt(low) == str.charAt(high))
		{
			// push all palindromes into the set
			set.add(str.substring(low, high + 1));

			// expand in both directions
			low--;
			high++;
		}
	}
	public static void allPalindromicSubStrings(String str)
	{
		
		Set<String> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++)
		{
			
			expand(str, i, i, set);
			expand(str, i, i + 1, set);
		}
		System.out.print(set);
	}

	public static void main(String[] args)
	{
		String str = "google";

		allPalindromicSubStrings(str);
	}
}