package org.solutions.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> cStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char new_Char = s.charAt(i);
            if (new_Char == '[' || new_Char == '{' || new_Char == '(') {
                cStack.push(new_Char);
            } else if (new_Char == ']' || new_Char == '}' || new_Char == ')') {
                if (cStack.isEmpty()) {
                    return false;
                }
                char past_Char = cStack.peek();
                if ((past_Char == '[' && new_Char == ']') || (past_Char == '{' && new_Char == '}') || (past_Char == '(' && new_Char == ')')) {
                    cStack.pop();
                } else {
                    return false;
                }
            }
        }
        return cStack.isEmpty();

    }
}
