package org.solutions.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class Problem30 {
    // 마구간이 말보다 많음
    // 말을 마구간에 넣어서 말 거리의 최솟값을 최대화하려고 함.
    // 정렬을 해야 하는가? 그럴걸
    // 정렬 안하면 값이 계속 바껴서 답 구하기 힘들듯.
    // 정렬한 값에서
    // 1 2 4 8 9 에서.
    // 제일 작은값, 큰 갑세 넣 고시작
    // 가장 가까운 두 말의 최대 거리 구하라니까.
    // 세마리 넣을때랑 네마리 넣을떄랑 위치가 달라지니까 이거 원 참
    // n마리를 한 번에 넣기 vs 3마리 4마리 순차적으로 넣기
    // n마리 한방에 넣을 수 있나?
    // 안될듯
    // 3마리 4마리 순차적으로 넣는 메서드 하나, 최소거리 구하는거 하나
    public static void main(String[] args) {
        Problem30 problem30 = new Problem30();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        problem30.solution(arr1, m);
    }

    private void solution(int[] arr1, int m) {
    }
}
