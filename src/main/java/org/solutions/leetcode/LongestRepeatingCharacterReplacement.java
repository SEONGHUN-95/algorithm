package org.solutions.leetcode;

public class LongestRepeatingCharacterReplacement {
    class Solution {
        public int characterReplacement(String s, int k) {
            // [A] ~ [Z]
            int[] alphabet = new int[26];
            int left = 0;

            int maxSize = 0;
            int maxValue = 0;

            for (int right = 0; right < s.length(); right++) {

                alphabet[s.charAt(right) - 'A']++;
                maxSize = Math.max(maxSize, alphabet[s.charAt(right) - 'A']);

                if ((right - left + 1) - maxSize > k) {
                    alphabet[s.charAt(left) - 'A']--;
                    left++;
                }
                maxValue = Math.max(maxValue, right - left + 1);
            }
            return maxValue;
        }
    }
}
