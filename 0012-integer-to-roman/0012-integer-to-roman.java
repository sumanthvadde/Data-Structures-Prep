class Solution {
    public String intToRoman(int num) {
        int[] keys = new int[]{ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] values = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            if (num >= keys[i]) {
                num = num - keys[i];
                sb.append(values[i]);
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}