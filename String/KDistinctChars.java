/* Given a string S and a number K. The task is to find the max length substring having exactly K distinct characters. */

import java.util.HashSet;
import java.util.Set;

class KDistinctChars
{
	
	public static final int CHAR_RANGE = 128;

	// Function to find longest substring of given string containing
	// k distinct characters using sliding window
	public static String longestSubstr(String str, int k)
	{
		
		int end = 0, begin = 0;
		Set<Character> window = new HashSet<>();

		int[] freq = new int[CHAR_RANGE];

		for (int low = 0, high = 0; high < str.length(); high++)
		{
			window.add(str.charAt(high));
			freq[str.charAt(high)]++;

			
			while (window.size() > k)
			{
				if (--freq[str.charAt(low)] == 0) {
					window.remove(str.charAt(low));
				}

				low++;	
			}

			if (end - begin < high - low)
			{
				end = high;
				begin = low;
			}
		}

		return str.substring(begin, end + 1);
	}

	
	public static void main(String[] args)
	{
		String str = "abcbdbdbbdcdabd";
		int k = 2;

		System.out.print(longestSubstr(str, k));

	}
}