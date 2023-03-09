package org.example.inflearn.javacote.chapter3;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("공통원소 구하기(two pointers algorithm)")
public class Quiz0303 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if(i > n - m) break;

            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += arr[j];
            }

            if(sum > answer) answer = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0303 t = new Quiz0303();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, m, arr));
    }
}
