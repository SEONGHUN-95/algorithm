package org.solutions.inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem20 {
    public static void main(String[] args) {
        Problem20 problem20 = new Problem20();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(problem20.solution(n, k, arr));

    }

    private int solution(int n, int k, int[] arr) {
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int m = j + 1; m < n; m++) {
                    tSet.add(arr[i] + arr[j] + arr[m]);
                }
            }
        }
        int cnt = 0;
        for (int x : tSet) {
            cnt++;
            if (cnt == k) return x;
        }
        return 0;
    }

}
