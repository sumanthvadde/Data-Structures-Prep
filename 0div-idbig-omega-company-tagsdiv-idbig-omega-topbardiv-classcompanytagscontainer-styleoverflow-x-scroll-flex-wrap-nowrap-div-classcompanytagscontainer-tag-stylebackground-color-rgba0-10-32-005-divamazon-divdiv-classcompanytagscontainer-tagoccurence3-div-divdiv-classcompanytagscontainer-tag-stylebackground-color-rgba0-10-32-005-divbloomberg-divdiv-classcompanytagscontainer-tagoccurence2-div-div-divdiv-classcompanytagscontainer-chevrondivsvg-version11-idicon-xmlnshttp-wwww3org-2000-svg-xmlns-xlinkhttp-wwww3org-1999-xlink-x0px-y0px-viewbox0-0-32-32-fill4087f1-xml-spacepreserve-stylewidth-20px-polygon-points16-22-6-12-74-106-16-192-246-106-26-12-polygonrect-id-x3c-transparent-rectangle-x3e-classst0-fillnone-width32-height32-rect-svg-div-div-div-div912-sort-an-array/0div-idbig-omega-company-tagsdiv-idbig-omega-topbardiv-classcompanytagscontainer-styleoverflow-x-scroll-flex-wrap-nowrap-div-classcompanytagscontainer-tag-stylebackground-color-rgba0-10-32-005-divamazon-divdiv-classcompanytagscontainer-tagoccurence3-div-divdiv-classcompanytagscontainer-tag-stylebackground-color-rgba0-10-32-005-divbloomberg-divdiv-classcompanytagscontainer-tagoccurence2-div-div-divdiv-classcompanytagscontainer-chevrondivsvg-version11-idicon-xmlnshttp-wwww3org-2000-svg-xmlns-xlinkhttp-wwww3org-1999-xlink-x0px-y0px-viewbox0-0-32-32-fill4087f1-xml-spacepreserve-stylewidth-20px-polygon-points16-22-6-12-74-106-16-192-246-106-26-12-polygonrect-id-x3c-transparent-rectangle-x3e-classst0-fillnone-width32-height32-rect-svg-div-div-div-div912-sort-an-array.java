class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void merge(int[] arr, int l, int m, int r) {
        // get sizes
        int n1 = m - l + 1;
        int n2 = r - m;

        // temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // put in data
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // init idxes
        int i = 0, j = 0;
        int k = l;

        // while
        while(i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // remainders
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // get middle
            int m = l + (r - l) / 2;

            // sort 2 halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // merge 2 halves
            merge(arr, l, m, r);
        }
    }
}
