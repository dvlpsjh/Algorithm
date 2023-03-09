package org.example.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("피보나치 수열")
public class Quiz0204 {
    public String solution(int n) {
        String answer = "1 1";
        int[] arr = new int[n];
        int prev1 = 1, prev2 = 1;

        for (int i = 0; i < n; i++) {
            if(i < 2) {
                System.out.println(prev1);
                continue;
            }
            int cur = prev1 + prev2;
            System.out.println(cur + " ");
            prev2 = prev1;
            prev1 = cur;
        }

        /* 배열 활용
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];

            answer += " " + arr[i];
        }
        */
        return answer;
    }

    public static void main(String[] args) {
        Quiz0204 m = new Quiz0204();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //System.out.println(m.solution(n));
        m.solution(n);
    }

}
