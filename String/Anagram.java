import java.util.HashMap;
import java.util.Map;

class Anagram
{
	
	public static boolean isAnagram(String X, String Y)
	{
		
		if (X.length() != Y.length()) {
			return false;
		}

		
		Map<Character, Integer> freq = new HashMap<>();

		for (int i = 0; i < X.length(); i++) {
			if (!freq.containsKey(X.charAt(i))) {
				freq.put(X.charAt(i), 1);
			}
			else {
				freq.put(X.charAt(i), freq.get(X.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < Y.length(); i++)
		{

			if (!freq.containsKey(Y.charAt(i))) {
				return false;
			}

			freq.put(Y.charAt(i), freq.get(Y.charAt(i)) - 1);


			if (freq.get(Y.charAt(i)) == 0) {
				freq.remove(Y.charAt(i));
			}
		}

		return freq.isEmpty();
	}

	public static void main(String[] args)
	{
		String X = "tommarvoloriddle";	
		String Y = "iamlordvoldemort";	

		if (isAnagram(X, Y)) {
			System.out.print("Anagram");
		} else {
			System.out.print("Not a Anagram");
		}

	}
}