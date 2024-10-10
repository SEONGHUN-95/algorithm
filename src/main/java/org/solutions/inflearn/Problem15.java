package org.solutions.inflearn;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Problem15 problem15 = new Problem15();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(problem15.solution(n, k, arr1));
    }

    int solution(int n, int k, int[] arr1) {
        int maxProfit = 0;
        int currProfit = 0;
        for (int i = 0; i < k; i++) {
            currProfit += arr1[i];
        }
        maxProfit = Math.max(maxProfit, currProfit);
        for (int i = 0; i < n - k; i++) {
            currProfit = currProfit - arr1[i] + arr1[k + i];
            maxProfit = Math.max(currProfit, maxProfit);

        }
        return maxProfit;
    }
}
