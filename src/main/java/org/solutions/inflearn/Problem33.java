package org.solutions.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem33 {
    int[] visited = new int[10001];
    int[] arr = {1, -1, 5};
    Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hl = sc.nextInt();
        int cl = sc.nextInt();
        System.out.println(BFS(hl, cl));
    }

    static int BFS(int hl, int cl) {
        Problem33 p = new Problem33();
        int depth = 1;
        p.visited[hl] = 1;
        p.queue.offer(hl);

        while (!p.queue.isEmpty()) {
            int size = p.queue.size();
            for (int j = 0; j < size; j++) {
                int curr_loc = p.queue.poll();
                for (int i = 0; i < 3; i++) {
                    int another_loc = curr_loc + p.arr[i];
                    if (another_loc == cl) {
                        return depth;
                    }
                    if (another_loc > 1 && another_loc < 10001 && p.visited[another_loc] == 0) {
                        p.visited[another_loc] = 1;
                        p.queue.offer(another_loc);
                    }
                }
            }
            depth++;
        }
        return 0;
    }
}
