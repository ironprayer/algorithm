package leetcode.ThreeSum;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int first = 0;
        int second = 1;
        int third = nums.length - 1;

        while (first != second && second != third) {
            int elementSum = nums[first] + nums[second] + nums[third]
            if (elementSum == 0) {
                result.add(Arrays.asList(nums[first], nums[second], nums[third]));
                first++;
                second++;
            } else if (elementSum > 0) {
                if(second == third - 1) {
                    second--;
                } else {
                    third--;
                }
            } else {
                if(second == third - 1) {
                    first++;
                } else {
                    second++;
                }
            }
        }

        return result.stream().toList();
    }
}
