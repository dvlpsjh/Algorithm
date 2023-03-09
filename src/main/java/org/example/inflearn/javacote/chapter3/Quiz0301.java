package org.example.inflearn.javacote.chapter3;

import jdk.jfr.Name;

import java.util.*;

@Name("두 배열 합치기") // two pointers algorithm
public class Quiz0301 {

    public int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n+m];

        System.arraycopy(arr1, 0, answer, 0, arr1.length);
        System.arraycopy(arr2, 0, answer, arr1.length, arr2.length);

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Quiz0301 t = new Quiz0301();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int x : t.solution(n, arr1, m, arr2)) System.out.print(x + " ");
    }
}
