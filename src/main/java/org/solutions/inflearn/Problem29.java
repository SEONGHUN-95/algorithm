package org.solutions.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Problem29 problem29 = new Problem29();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        problem29.solution(arr1, m);
    }

    // 주어진 DVD 용량으로 m개의 DVD에 나눠 담을 수 있는지 확인하는 함수
    private static boolean canDivide(int[] songs, int m, int capacity) {
        int dvdCount = 1; // DVD의 개수
        int sum = 0;

        for (int song : songs) {
            if (sum + song > capacity) {
                dvdCount++; // 새로운 DVD가 필요
                sum = song; // 현재 곡을 새로운 DVD에 넣음
                if (dvdCount > m) { // DVD 개수가 m을 초과하면 불가능
                    return false;
                }
            } else {
                sum += song;
            }
        }

        return true; // m개의 DVD에 나눠 담을 수 있으면 true
    }

    private int solution(int[] songs, int m) {
        int max = Arrays.stream(songs).sum(); // 모든 곡을 하나의 DVD에 담을 경우 (최대값)
        int min = Arrays.stream(songs).max().getAsInt(); // 가장 긴 곡 (최소값)

        int answer = max;

        // 이진 탐색
        while (min <= max) {
            int mid = (min + max) / 2;
            if (canDivide(songs, m, mid)) {
                answer = mid; // 가능한 용량이면 그 값을 저장하고, 더 작은 용량을 탐색
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return answer;
    }

}
