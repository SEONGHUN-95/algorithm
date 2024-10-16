package org.solutions.inflearn;

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Problem26 Problem26 = new Problem26();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] answer = Problem26.solution(n, arr1);
        for (int a : answer) {
            System.out.print(a + " ");
        }

    }

    private int[] solution(int n, int[] arr1) {
        // 갑자기 작아지면 작아진 인덱스-1 가 철수, 또 작아지면 이번엔 작아진 인덱스가 짝궁?
        int[] answer = new int[2];

        int idx = 0;
        while (idx < n) {
            if (arr1[idx] > arr1[idx + 1]) {
                answer[0] = ++idx;
                break;
            }
            idx++;
        }
        while (idx < n) {
            if (arr1[idx] > arr1[idx + 1]) {
                answer[1] = idx+2;
                break;
            }
            idx++;
        }
        return answer;
    }

}
