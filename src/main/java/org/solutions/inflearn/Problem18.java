package org.solutions.inflearn;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Problem18 problem18 = new Problem18();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(problem18.solution(n, k, arr1));
    }

    private int solution(int n, int k, int[] arr1) {
        // arr1을 받아서 투 포인터로 최대 길이를 추적한다.
        int start = 0, cnt = 0, max_len = 0;

        for (int end = 0; end < n; end++) {
            if (arr1[end] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr1[start] == 0) {
                    cnt--;
                }
                // start++ 해주는 위치가 코드 중복을 가른다.
                start++;
            }
            max_len = Math.max(end - start + 1, max_len);
        }
        return max_len;

    }


}
