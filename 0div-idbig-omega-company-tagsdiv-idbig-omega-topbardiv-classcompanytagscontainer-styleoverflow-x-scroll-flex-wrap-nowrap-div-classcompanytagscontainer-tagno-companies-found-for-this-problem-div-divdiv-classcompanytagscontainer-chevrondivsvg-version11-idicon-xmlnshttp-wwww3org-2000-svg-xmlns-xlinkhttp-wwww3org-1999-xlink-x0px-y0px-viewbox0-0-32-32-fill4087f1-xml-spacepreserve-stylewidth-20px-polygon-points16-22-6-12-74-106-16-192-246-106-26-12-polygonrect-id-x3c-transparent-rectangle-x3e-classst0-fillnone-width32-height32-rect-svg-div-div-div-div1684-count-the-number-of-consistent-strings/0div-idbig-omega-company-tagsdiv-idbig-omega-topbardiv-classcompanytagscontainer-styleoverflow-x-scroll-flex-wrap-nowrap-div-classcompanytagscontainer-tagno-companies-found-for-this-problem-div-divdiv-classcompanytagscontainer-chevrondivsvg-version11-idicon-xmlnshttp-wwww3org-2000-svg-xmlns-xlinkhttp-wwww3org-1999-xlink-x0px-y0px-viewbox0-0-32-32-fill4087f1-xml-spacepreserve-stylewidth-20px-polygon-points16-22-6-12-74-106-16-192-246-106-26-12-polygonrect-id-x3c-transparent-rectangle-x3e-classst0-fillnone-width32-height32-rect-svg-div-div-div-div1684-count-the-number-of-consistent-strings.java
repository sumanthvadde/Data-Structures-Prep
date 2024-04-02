class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
	int consistent = 0;
	Set<Character> allowedLetters = new HashSet<>(); 

	for(char letter : allowed.toCharArray())
	{
		allowedLetters.add(letter);
	}

	for(String word : words)
	{
		for(int i = 0; i < word.length(); i++)
		{
			if(!allowedLetters.contains(word.charAt(i)))
			{
				break;
			}

			if(i == word.length() -1)
			{
				consistent++;
			}
		}
	}

	return consistent;
}
}