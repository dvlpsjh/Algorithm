package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("삽입 정렬")
public class Q0603R {
    public static void main(String[] args) {
        Q0603R t = new Q0603R();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : t.solution(arr)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < answer.length; i++) {
            int target = answer[i];
            int j = i - 1;

            while (j >= 0 && answer[j] > target) {
                answer[j + 1] = answer[j];
                j--;
            }

            answer[j + 1] = target;
        }

        return answer;
    }
}
