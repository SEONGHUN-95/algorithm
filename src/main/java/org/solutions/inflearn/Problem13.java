package org.solutions.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Problem13 problem13 = new Problem13();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] answer = (problem13.solution(n, m, arr1, arr2));
        for(int a : answer){
            System.out.print(a+" ");
        }
    }

    private int[] solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answerList = new ArrayList<>();
        int nIdx = 0;
        int mIdx = 0;
        while (nIdx < n && mIdx < m) {
            if (arr1[nIdx] < arr2[mIdx]) {
                answerList.add(arr1[nIdx]);
                nIdx++;
            } else {
                answerList.add(arr2[mIdx]);
                mIdx++;
            }
        }
        while (nIdx < n) {
            answerList.add(arr1[nIdx++]);
        }
        while (mIdx < m) {
            answerList.add(arr2[mIdx++]);
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
