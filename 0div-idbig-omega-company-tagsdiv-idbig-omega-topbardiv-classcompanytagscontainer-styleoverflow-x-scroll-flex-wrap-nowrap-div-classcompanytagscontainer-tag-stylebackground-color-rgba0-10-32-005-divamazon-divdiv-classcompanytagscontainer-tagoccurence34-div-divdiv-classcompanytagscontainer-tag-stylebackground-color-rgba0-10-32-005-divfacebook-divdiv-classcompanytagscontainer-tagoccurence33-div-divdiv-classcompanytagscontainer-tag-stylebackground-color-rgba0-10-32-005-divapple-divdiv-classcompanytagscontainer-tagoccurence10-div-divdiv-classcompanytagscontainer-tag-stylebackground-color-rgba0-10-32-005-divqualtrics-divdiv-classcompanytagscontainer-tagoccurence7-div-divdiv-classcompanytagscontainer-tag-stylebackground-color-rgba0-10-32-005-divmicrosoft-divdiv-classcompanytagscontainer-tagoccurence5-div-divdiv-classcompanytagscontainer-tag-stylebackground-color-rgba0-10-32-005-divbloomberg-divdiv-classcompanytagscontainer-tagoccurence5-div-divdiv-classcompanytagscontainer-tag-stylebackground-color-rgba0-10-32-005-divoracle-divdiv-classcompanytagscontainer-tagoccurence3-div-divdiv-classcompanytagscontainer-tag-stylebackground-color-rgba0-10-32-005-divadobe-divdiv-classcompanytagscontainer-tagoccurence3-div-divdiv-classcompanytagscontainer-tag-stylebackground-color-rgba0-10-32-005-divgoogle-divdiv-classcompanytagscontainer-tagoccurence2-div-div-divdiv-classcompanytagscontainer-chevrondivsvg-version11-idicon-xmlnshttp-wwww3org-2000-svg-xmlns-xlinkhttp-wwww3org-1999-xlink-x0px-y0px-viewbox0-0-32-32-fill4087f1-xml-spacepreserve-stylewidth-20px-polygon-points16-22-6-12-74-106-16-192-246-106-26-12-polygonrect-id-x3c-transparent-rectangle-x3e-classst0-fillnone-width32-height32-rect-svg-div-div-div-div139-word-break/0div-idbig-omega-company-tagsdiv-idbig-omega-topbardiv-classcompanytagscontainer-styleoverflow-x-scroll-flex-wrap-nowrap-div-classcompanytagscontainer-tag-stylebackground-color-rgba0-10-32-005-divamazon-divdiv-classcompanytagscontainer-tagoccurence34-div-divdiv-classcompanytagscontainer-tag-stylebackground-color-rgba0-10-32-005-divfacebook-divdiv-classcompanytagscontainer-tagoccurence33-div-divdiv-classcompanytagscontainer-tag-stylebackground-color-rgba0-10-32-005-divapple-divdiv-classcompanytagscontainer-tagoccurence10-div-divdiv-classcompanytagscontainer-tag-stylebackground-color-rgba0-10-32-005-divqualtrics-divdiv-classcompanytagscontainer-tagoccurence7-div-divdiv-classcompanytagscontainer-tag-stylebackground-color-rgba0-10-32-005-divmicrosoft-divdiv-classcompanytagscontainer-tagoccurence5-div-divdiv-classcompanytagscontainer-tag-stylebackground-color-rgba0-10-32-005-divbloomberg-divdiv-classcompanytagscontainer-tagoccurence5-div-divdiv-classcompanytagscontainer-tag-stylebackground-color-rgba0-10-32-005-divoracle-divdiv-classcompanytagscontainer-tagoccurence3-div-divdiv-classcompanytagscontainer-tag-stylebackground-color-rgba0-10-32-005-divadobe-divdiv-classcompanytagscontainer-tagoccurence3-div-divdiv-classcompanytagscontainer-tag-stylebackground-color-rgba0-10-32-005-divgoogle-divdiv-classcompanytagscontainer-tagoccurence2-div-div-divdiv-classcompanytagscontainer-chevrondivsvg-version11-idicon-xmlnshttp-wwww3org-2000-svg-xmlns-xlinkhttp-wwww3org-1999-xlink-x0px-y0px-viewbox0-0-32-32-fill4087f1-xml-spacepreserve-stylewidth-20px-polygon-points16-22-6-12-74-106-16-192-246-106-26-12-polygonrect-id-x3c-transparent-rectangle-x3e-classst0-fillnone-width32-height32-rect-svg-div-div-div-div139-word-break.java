public class Solution {
    private Map<Integer, Boolean> memo = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        return solve(s, 0, wordSet);
    }

    public boolean solve(String s, int start, Set<String> words) {
        // Check if we have already computed the result for the current substring starting at index 'start'
        if (memo.containsKey(start)) return memo.get(start);

        // If 'start' equals the length of 's', then we've successfully segmented the entire string
        if (start == s.length()) return true;

        // Try every possible end index for the current substring starting from 'start'
        for (int end = start + 1; end <= s.length(); end++) {
            String temp = s.substring(start, end);
            if (words.contains(temp) && solve(s, end, words)) {
                memo.put(start, true);
                return true;
            }
        }

        // If no valid segmentation is found, memoize and return false
        memo.put(start, false);
        return false;
    }
}