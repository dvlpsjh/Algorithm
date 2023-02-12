package org.inflearn.javacote.chapter3;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("연속된 자연수의 합: Two pointers")
public class Quiz0305 {

    /** 재도전 필요함 */
    public int solution(int n) {
        int answer = 0, sum = 0, lt=0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0305 m = new Quiz0305();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(m.solution(n));
    }
}
