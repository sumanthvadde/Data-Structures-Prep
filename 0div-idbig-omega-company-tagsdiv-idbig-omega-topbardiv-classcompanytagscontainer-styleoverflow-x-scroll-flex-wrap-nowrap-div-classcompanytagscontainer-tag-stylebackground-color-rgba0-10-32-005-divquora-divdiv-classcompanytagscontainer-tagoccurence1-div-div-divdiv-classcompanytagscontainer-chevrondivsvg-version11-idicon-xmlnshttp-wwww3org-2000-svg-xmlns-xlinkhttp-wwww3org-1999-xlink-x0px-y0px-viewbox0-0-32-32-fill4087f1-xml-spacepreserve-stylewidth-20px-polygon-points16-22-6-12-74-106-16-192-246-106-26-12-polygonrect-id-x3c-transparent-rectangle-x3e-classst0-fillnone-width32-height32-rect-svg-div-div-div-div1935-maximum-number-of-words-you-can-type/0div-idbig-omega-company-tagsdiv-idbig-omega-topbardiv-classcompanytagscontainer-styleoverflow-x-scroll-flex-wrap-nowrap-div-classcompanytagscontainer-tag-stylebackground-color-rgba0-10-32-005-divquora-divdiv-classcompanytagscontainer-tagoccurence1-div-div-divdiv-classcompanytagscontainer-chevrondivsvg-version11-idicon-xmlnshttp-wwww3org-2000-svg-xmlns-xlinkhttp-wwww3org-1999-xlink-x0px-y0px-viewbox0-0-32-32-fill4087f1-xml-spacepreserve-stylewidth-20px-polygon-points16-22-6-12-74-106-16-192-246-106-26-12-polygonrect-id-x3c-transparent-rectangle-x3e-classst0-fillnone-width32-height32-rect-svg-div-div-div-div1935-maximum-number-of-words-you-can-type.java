class Solution {
    public int canBeTypedWords(String text, String broken) {
   return (int) Arrays.stream(text.split(" ")).filter(s -> s.chars().allMatch(c -> broken.indexOf(c) == -1)).count();
}
}