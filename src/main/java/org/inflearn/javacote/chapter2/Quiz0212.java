package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("멘토링") // 4중 for문
public class Quiz0212 {

    /** 선생님 풀이 */
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }

                    if(pi < pj) cnt++;
                }

                if(cnt == m) answer++;
            }
        }

        return answer;
    }

    public int solution2(int n, int m, int[][] arr) {    // n : 학생수, m : 시험횟수
        int answer = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if(j == i) continue;
                boolean flag = true;

                int idx1 = -1, idx2 = -1;
                for (int k = 0; k < m; k++) {
                    for (int l = 0; l < n; l++) {
                        if(arr[k][l] == i) idx1 = l;
                        if(arr[k][l] == j) idx2 = l;
                    }

                    if(idx1 >= idx2) {
                        flag = false;
                        break;
                    }
                }

                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0212 t = new Quiz0212();
        Scanner sc = new Scanner(System.in);

        int[] nm = new int[2];
        for (int i = 0; i < 2; i++) {
            nm[i] = sc.nextInt();
        }

        int n = nm[0];   // 학생수
        int m = nm[1];   // 시험횟수

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(t.solution(n, m, arr));
    }
}
