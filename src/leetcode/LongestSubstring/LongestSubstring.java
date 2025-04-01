package leetcode.LongestSubstring;

import java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charExistCheck = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(charExistCheck.containsKey(currentChar)) {
                while(!queue.isEmpty()) {
                    char queueChar = queue.poll();
                    charExistCheck.remove(queueChar);

                    if(queueChar == currentChar) break;
                }
            }
            charExistCheck.put(currentChar, 0);
            queue.offer(currentChar);
            maxLength = Math.max(maxLength, queue.size());
        }
        return maxLength;
    }
}
