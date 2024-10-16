package org.solutions.inflearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Problem27 Problem27 = new Problem27();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Problem27.solution(n, arr);
    }

    private void solution(int n, int[][] arr) {
        Arrays.sort(arr, (a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
