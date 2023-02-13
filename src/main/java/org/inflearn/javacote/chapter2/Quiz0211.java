package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

@Name("임시반장 정하기")
public class Quiz0211 {

    /** 혼자서 다시 해보기 */
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {  // i는 학생번호
            int cnt = 0;
            for (int j = 1; j <= n; j++) {  // j도 학생번호
                for (int k = 1; k <= 5; k++) {  // k는 학년
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;  // break을 해줘야 동일한 학생이 카운팅 안됨
                    }
                }

                if(cnt > max) {
                    max = cnt;
                    answer = i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0211 m = new Quiz0211();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(m.solution(n, arr));
    }
}
