package org.example.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("봉우리") // 3중 for문
public class Quiz0210 {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    /** 선생님 풀이 */
    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];   // 행좌표
                    int ny = j + dy[k];   // 열좌표

                    if(nx >= 0 && nx < n
                            && ny >= 0 && ny < n) {
                        if(arr[nx][ny] >= arr[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                }

                if(flag) answer++;
            }
        }

        return answer;
    }

    public int solution2(int n, int[][] arr) {
        int answer = 0;
        int[][] square = new int[n+2][n+2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i+1][j+1] = arr[i][j];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int height = square[i][j];
                if(height > square[i-1][j]
                        && height > square[i+1][j]
                        && height > square[i][j-1]
                        && height > square[i][j+1]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0210 m = new Quiz0210();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(n, arr));
    }
}
