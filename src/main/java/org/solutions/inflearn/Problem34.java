package org.solutions.inflearn;

import java.util.Scanner;

public class Problem34 {
    static int n, total = 0;
    static String result = "NO";
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(result);
    }

    private static void DFS(int L, int sum, int[] arr) {
        if (flag)
            return;
        if (L == n) {
            if ((sum == total - sum)) {
                result = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }


    }
}
