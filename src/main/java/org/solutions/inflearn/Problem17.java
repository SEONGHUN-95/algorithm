package org.solutions.inflearn;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Problem17 problem17 = new Problem17();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(problem17.solution(n));
    }

    private int solution(int n) {
        int sum = 0, answer = 0, start = 1, end = 1;
        int limit = (int) Math.ceil(n / 2.0);
        for (end = 1; end <= limit; end++) {
            sum += end;
            while (sum > n) {
                sum -= start;
                start++;

            }
            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }
}

