package org.solutions.inflearn;

import java.util.Scanner;

public class Problem12 {
    int solution(int[][] arr){

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                System.out.println(arr[i][j]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Problem12 problem12 = new Problem12();
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int tests = sc.nextInt();
        int[][] arr = new int[tests][people];
        for(int i = 0 ; i<tests ; i++){
            for(int j = 0 ; j<people ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(problem12.solution(arr));
    }
}
