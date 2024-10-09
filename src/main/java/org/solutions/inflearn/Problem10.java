package org.solutions.inflearn;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] blocks = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                blocks[i][j] = sc.nextInt();
            }
        }
        Problem10 problem10 = new Problem10();
        System.out.println(problem10.solution(num, blocks));
    }

    public int solution(int num, int[][] arr) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                boolean flag = true;
                for(int k = 0 ; k<4 ; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx>=0 && ny>=0 && nx<num&& ny<num && arr[nx][ny]>=arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;

            }
        }

        return answer;
    }

}
