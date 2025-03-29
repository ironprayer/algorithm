package leetcode.KClosetPointToOrigin;

public class KClosetPointToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int[][] answer = new int[k][2];
        int[] euclideanValues = new int[k];
        int max = 0;

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int euclideanValue = x * x + y * y;

            if ( k > 0 ) {
                max = Math.max(max, euclideanValue);
                answer[i][0] = x;
                answer[i][1] = y;
                euclideanValues[i] = euclideanValue;
                k--;
            } else if (max > euclideanValue) {
                for (int j = 0; j < k; j++) {
                    answer[j][0] = x;
                    answer[j][1] = y;

                    if(max == (x * x + y * y)) {}
                }
            }
        }
    }
}
