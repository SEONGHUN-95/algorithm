package org.solutions.inflearn;


import java.util.Scanner;

public class Problem31 {
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        arr = new int[n + 1];
        System.out.println(dfs(n));
    }

    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = dfs(n - 1) + dfs(n - 2);
        return arr[n];
    }


}
