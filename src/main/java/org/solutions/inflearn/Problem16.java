package org.solutions.inflearn;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Problem16 problem16 = new Problem16();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(problem16.solution(n, k, arr1));
    }

    private int solution(int n, int k, int[] arr1) {
        // 배열 인덱스가 증가하면서 더하되 값이 같거나 크면 끝
        int answer = 0;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += arr1[end];
            while (sum > k) {
                sum -= arr1[start];
                start++;
            }
            if (sum == k) {
                answer++;
            }
            end++;
        }
        return answer;
    }
}
