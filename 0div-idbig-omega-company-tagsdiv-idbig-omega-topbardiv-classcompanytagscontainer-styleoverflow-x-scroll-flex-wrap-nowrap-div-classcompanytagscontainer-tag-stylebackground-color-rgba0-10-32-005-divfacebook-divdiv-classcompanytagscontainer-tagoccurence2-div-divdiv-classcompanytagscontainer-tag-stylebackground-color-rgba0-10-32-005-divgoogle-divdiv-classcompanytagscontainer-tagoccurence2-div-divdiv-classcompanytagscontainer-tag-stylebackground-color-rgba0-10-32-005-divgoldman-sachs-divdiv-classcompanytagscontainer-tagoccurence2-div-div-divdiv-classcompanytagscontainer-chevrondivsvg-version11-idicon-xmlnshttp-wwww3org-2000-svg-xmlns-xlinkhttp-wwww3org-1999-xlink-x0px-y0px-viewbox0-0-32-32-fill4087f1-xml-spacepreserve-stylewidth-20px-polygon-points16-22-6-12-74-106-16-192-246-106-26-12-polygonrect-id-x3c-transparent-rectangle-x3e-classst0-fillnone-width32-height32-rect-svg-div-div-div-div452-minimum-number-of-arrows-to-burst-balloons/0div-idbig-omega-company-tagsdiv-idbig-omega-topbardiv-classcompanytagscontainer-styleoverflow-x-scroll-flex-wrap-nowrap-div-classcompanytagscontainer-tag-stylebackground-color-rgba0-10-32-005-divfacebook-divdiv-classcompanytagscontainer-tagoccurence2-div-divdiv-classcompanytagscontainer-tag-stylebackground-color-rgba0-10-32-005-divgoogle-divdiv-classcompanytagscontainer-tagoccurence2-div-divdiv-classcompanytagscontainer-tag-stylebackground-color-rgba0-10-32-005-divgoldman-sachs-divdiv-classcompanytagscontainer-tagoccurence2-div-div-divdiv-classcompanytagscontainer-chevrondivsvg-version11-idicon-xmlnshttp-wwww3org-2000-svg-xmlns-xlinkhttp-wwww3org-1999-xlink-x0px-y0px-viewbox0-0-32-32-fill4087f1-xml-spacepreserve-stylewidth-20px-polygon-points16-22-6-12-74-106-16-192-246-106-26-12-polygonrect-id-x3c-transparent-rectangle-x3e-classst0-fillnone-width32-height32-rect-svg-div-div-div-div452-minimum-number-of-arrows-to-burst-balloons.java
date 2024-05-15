class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        // Sort the points based on their end position
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1; // We need at least one arrow to start
        int end = points[0][1]; // Initial end point where the first arrow can be shot

        for (int i = 1; i < points.length; i++) {
            // If the start of the next balloon is greater than the end of the last one,
            // it means we need a new arrow.
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1]; // Update the end to this balloon's end
            }
        }

        return arrows;
    }
}