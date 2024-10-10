package org.solutions.inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Problem14 problem14 = new Problem14();
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
        int[] answer = (problem14.solution(n, m, arr1, arr2));
        for(int a : answer){
            System.out.print(a+" ");
        }
    }

    private int[] solution(int n, int m, int[] arr1, int[] arr2) {
        List<Integer> answerList = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int nIdx = 0;
        int mIdx = 0;
        while(nIdx<n && mIdx<m){
            if(arr1[nIdx] == arr2[mIdx]){
                answerList.add(arr1[nIdx]);
                nIdx++;
                mIdx++;
            } else if (arr1[nIdx]>arr2[mIdx]) {
                mIdx++;
            }
            else{
                nIdx++;
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

}
