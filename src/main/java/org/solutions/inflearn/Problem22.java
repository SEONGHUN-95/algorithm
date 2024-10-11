package org.solutions.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Problem22 {
    public static void main(String[] args) {
        Problem22 problem22 = new Problem22();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(problem22.solution(line));

    }

    private String solution(String line) {
        Stack<Character> stack = new Stack<>();
        // 검사하고 하나씩 넣다가 () 완성되면 ( 나올떄까지 다 뺸다.
        // ()완성되는걸 어케 잡지?
        // 걍 넣다가 )발견되면 (나올떄까지 다토해내기
        // (없었고 그냥 들어가는건 냅둬야함.
        //
        for (char c : line.toCharArray()) {
            stack.push(c);
            if (c == ')') {
                while (!stack.isEmpty() && stack.pop() != '(') {

                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
