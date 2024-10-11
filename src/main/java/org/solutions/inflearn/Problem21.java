package org.solutions.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class Problem21 {
    public static void main(String[] args) {
        Problem21 problem21 = new Problem21();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(problem21.solution(line));

    }

    private String solution(String line) {
        // 시작이 )로 시작하면 걍 NO
        // 시작은 (로 했으나 중간에 )이 (개수보다 많아지면 NO
        // (개수랑 )개수랑 안맞아도 NO
        // 다 통과해야 YES

        int num = 0;
        for (char c : line.toCharArray()) {
            if (c == '(') {
                num++;
            } else if (c == ')') {
                num--;
            }
            if (num < 0) {
                return "NO";
            }
        }
        if (num == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }

}
