package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("격자판 최대합")
public class Quiz0209 {

    /** 선생님 풀이 */
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2; // sum1 : 행의 합, sum2 : 열의 합

        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public int solution2(int n, int[][] squares) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) sum += squares[i][j];

            if(sum > answer) answer = sum;

            sum = 0;
            for (int j = 0; j < n; j++) sum += squares[j][i];

            if(sum > answer) answer = sum;
        }

        int sum_one = 0, sum_two = 0;
        for (int i = 0; i < n; i++) {
            sum_one += squares[i][i];
            sum_two += squares[i][n-i-1];
        }

        if(sum_one > answer) answer = sum_one;
        if(sum_two > answer) answer = sum_two;

        return answer;
    }

    public static void main(String[] args) {
        Quiz0209 m = new Quiz0209();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] squares = new int[n][n];

        // 선생님 Scanner 코드
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squares[i][j] = sc.nextInt();
            }
        }

        /*
        for (int i = 0; i < n; i++) {
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) arr[j] = sc.nextInt();

            squares[i] = arr;
        }
        */
        System.out.println(m.solution(n, squares));
    }
}
