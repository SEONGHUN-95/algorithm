package org.solutions.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    class Solution {
        Map<Character, String> keyboard = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );

        public List<String> letterCombinations(String digits) {
            List<String> answer = new ArrayList<>();
            if (digits.length() == 0) return answer;
            dfs(answer, digits, "");
            return answer;
        }

        void dfs(List<String> answer, String digits, String currAnswer) {
            if (currAnswer.length() == digits.length()) {
                answer.add(currAnswer);
                return;
            }
            // digits의 해당 자리수의 숫자
            char nextDigit = digits.charAt(currAnswer.length());
            String nextDigits = keyboard.get(nextDigit);
            for (int i = 0; i < nextDigits.length(); i++) {
                char alphabet = nextDigits.charAt(i);
                dfs(answer, digits, currAnswer + alphabet);
            }
        }
    }
}
