package leetcode.Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int height = mat.length;
        int width = mat[0].length;

        int[][] resultMat = new int[height][width];
        Queue<int[]> queue = new LinkedList<>();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if(mat[y][x] == 0) {
                    queue.add(new int[]{y, x});
                } else {
                    resultMat[y][x] = -1;
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[1];
            int y = arr[0];
            int currentPosVal = resultMat[y][x];

            if( x + 1 < width ) {
                if(resultMat[y][x + 1] == -1) {
                    resultMat[y][x + 1] = currentPosVal + 1;
                    queue.add(new int[]{y, x + 1});
                }
            }

            if( x - 1 >= 0 ) {
                if(resultMat[y][x - 1] == -1) {
                    resultMat[y][x - 1] = currentPosVal + 1;
                    queue.add(new int[]{y, x - 1});
                }
            }

            if( y + 1 < height ) {
                if(resultMat[y + 1][x] == -1) {
                    resultMat[y + 1][x] = currentPosVal + 1;
                    queue.add(new int[]{y + 1, x});
                }
            }

            if( y - 1 >= 0 ) {
                if(resultMat[y - 1][x] == -1) {
                    resultMat[y - 1][x] = currentPosVal + 1;
                    queue.add(new int[]{y -1, x});
                }
            }
        }
        return resultMat;
    }
}
