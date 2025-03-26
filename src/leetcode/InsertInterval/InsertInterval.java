package leetcode.InsertInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        boolean isInsert = false;
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (start > newEnd) {
                if(!isInsert){
                    result.add(new int[]{newStart, newEnd});
                    isInsert = true;
                }
                result.add(new int[]{start, end});
            } else if (end < newStart) {
                result.add(new int[]{start, end});
            }

            if (start <= newStart && newStart <= end) {
                newStart = start;
            }

            if (start <= newEnd && newEnd <= end) {
                newEnd = end;
            }
        }

        if(!isInsert) {
            result.add(new int[]{newStart, newEnd});
        }

        return result.toArray(int[][]::new);
    }
}
