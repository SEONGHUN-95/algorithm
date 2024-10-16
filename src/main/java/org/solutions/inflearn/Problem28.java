package org.solutions.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Problem28 problem28 = new Problem28();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        problem28.solution(arr1, k);
    }

    private void solution(int[] arr1, int k) {
        Arrays.sort(arr1);
        for(int a : arr1){
            System.out.print(a+" ");
        }
        System.out.println();

        int index = searchRecursive(arr1, 0, arr1.length - 1, k);  // 시작과 끝 범위를 설정
        if (index == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value found at position: " + (index + 1));  // 1-based index
        }
    }

    // 이진 탐색 (재귀적 구현)
    private int searchRecursive(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int mid = low + (high - low) / 2;  // 중간 인덱스 계산

            if (arr[mid] == k) {
                return mid;  // 값이 일치하면 해당 인덱스 반환
            } else if (arr[mid] < k) {
                return searchRecursive(arr, mid + 1, high, k);  // 오른쪽 절반 탐색
            } else {
                return searchRecursive(arr, low, mid - 1, k);  // 왼쪽 절반 탐색
            }
        }
        return -1;  // 값이 없으면 -1 반환
    }
}
