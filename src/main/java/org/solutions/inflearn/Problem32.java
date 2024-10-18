package org.solutions.inflearn;

import java.util.Scanner;

public class Problem32 {
    static int[] visited;
    static int a = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        solution(a);
    }

    private static void solution(int a) {
        visited = new int[a + 1];
        DFS(1);
    }

    private static void DFS(int n) {
        if (n == a+1) {
            String answer = "";
            for (int i = 1; i <= a; i++) {
                if (visited[i] == 1) {
                    answer += i + " ";
                }
            }
            if (!answer.equals("")) {
                System.out.println(answer);
            }
        } else {
            visited[n] = 1;
            DFS(n + 1);
            visited[n] = 0;
            DFS(n + 1);
        }


    }

}
