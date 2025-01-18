package org.solutions.baekjoon;

import java.util.Scanner;

public class Problem2578 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int callCount = 0;
        Scanner scanner = new Scanner(System.in);

        // 빙고판 입력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 숫자 호출 및 빙고 체크
        for (int i = 0; i < 25; i++) {
            int n = scanner.nextInt();
            callCount++;
            markNumber(arr, n);

            if (callCount >= 12) { // 12번째 호출 이후부터 빙고 체크
                int bingoCount = countBingo(arr);
                if (bingoCount >= 3) {
                    System.out.println(callCount);
                    return;
                }
            }
        }
    }

    // 숫자를 빙고판에서 마킹
    private static void markNumber(int[][] arr, int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == num) {
                    arr[i][j] = -1; // 호출된 숫자는 -1로 표시
                }
            }
        }
    }

    // 빙고 개수를 계산
    private static int countBingo(int[][] arr) {
        int bingoCount = 0;
        int dig1 = 0, dig2 = 0;

        for (int i = 0; i < 5; i++) {
            int row = 0, col = 0;
            for (int j = 0; j < 5; j++) {
                row += arr[i][j];
                col += arr[j][i];
            }
            // 가로와 세로 빙고 확인
            if (row == -5) bingoCount++;
            if (col == -5) bingoCount++;

            // 대각선 빙고는 i 루프에서 따로 계산
            dig1 += arr[i][i];
            dig2 += arr[i][4 - i];
        }

        // 대각선 빙고 확인
        if (dig1 == -5) bingoCount++;
        if (dig2 == -5) bingoCount++;

        return bingoCount;
    }
}
