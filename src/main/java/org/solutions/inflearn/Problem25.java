package org.solutions.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Problem25 {
    public static void main(String[] args) {
        Problem25 problem25 = new Problem25();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(problem25.solution(line));

    }

    private int solution(String line) {
        // 1. 쇠막대기 개수 정하기(레이저 위치, 괄호 위치 고려)
        // 1-1 스택으로 담다가 ()모양은 거르고 "(",")"모양만 거든다. 근데 인덱스도 저장해야함.
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < line.length(); i++) {
            char curr_char = line.charAt(i);

            if (curr_char == '(') {
                stack.push(curr_char);
            } else {
                stack.pop();
                if (stack.isEmpty()) continue;
                if (line.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }


        }
        return answer;
    }
}
