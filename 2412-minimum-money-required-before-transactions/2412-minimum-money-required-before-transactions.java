class Solution {
     public long minimumMoney(int[][] A) {
        long res = 0; int v = 0;
        for (int[] a : A) {
            v = Math.max(v, Math.min(a[0], a[1]));
            res += Math.max(a[0] - a[1], 0);
        }
        return res + v;
    }
}