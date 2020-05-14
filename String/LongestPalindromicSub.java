class LongestPalindromicSub
{
	
	public static String expand(String str, int low, int high)
	{
		if(s.length==0){
		return "No";
		}
		int len = str.length();
		while (low >= 0 && high < len &&
				(str.charAt(low) == str.charAt(high))) {
			low--;
			high++;
		}

		return str.substring(low + 1, high);
	}

	public static String LongestPalindromicSubString(String str, int len)
	{
		
		String max_str = "", curr_str;

		int max_length = 0, curr_length;


		for (int i = 0; i < len; i++)
		{
			

			curr_str = expand(str, i, i);
			curr_length = curr_str.length();

			if (curr_length > max_length)
			{
				max_length = curr_length;
				max_str = curr_str;
			}

			curr_str = expand(str, i, i + 1);
			curr_length = curr_str.length();


			if (curr_length > max_length)
			{
				max_length = curr_length;
				max_str = curr_str;
			}
		}

		return max_str;
	}

	public static void main(String[] args)
	{
		String str = "ABDCBCDBDCBBC";

		System.out.println("Longest Palindromic SubString of " + str + " is "
				+ LongestPalindromicSubString(str, str.length() - 1));
	}
}