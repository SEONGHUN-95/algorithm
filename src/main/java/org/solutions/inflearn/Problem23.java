package org.solutions.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem23 {
    public static void main(String[] args) {
        Problem23 problem23 = new Problem23();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(problem23.solution(n, arr1, m, arr2));

    }

    private int solution(int n, int[][] arr1, int m, int[] arr2) {
        List<Stack<Integer>> craneStackList = new ArrayList<>();
        Stack<Integer> bucketStack = new Stack<>();
        int answer = 0;
        // 크레인 스택리스트에 순서대로 담기
        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = n - 1; j >= 0; j--) {
                if (arr1[j][i] != 0) {
                    stack.push(arr1[j][i]);
                } ;
            }
            craneStackList.add(stack);
        }
        // 하나씩 담되 stack 비어있으면 다음으로 패스
        // 버킷에 두개 연속이면 pop하기
        for (int a : arr2) {
            Stack<Integer> crane = craneStackList.get(a - 1);
            if (!crane.isEmpty()) {
                // 잡힌 인형 k
                int k = crane.pop();
                if (!bucketStack.empty() && bucketStack.peek() == k) {
                    bucketStack.pop();
                    answer = answer + 2;
                } else {
                    bucketStack.push(k);
                }
            }
        }
        return answer;
    }


}
