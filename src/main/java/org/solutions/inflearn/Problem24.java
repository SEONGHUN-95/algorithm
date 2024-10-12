package org.solutions.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Problem24 {
    public static void main(String[] args) {
        Problem24 problem24 = new Problem24();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(problem24.solution(line));

    }

    private int solution(String line) {
        Stack<Integer> stack = new Stack<>();

        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();
                if (c == '-') {
                    op2 -= op1;
                } else if (c == '+') {
                    op2 += op1;
                } else if (c == '*') {
                    op2 *= op1;
                } else if (c == '/') {
                    op2 /= op1;
                }
                stack.push(op2);
            }

        }

        return stack.pop();
    }
}
