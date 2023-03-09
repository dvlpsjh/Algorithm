package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("버블 정렬")  // 오름차순
/**
 * bubble sort algorithm
 * 1. 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
 *  1-1. 인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 서로 교환한다.
 * 2. 선택 정렬과 기본 개념이 유사하다.
 * 3. 버블 정렬 알고리즘의 구체적인 개념
 *  3-1. 버블 정렬은 첫번째 자료와 두번째 자료를, 두번째 자료와 세번째 자료를 ,세번째와 네번째를, ....
 *       이런 식으로 (마지막-1)번째 자료와 마지막 자료를 비교하여 교환하면서 자료를 정렬한다.
 *  3-2. 1회전을 수행하고 나면 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외되고, 2회전을 수행하고 나면
 *       끝에서 두번째 자료까지는 정렬에서 제외된다. 이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다.
 *  4. T(n) = O(n^2)
 * */
public class Q0602 {
    public static void main(String[] args) {
        Q0602 t = new Q0602();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : t.solution(arr)) {
            System.out.print(x + " ");
        }

    }

    private int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length - i; j++) {
                if(j == (answer.length - i - 1)) break;

                if (answer[j] > answer[j + 1]) {
                    int tmp = 0;
                    tmp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tmp;
                }
            }
        }

        return answer;
    }

    /**
     * 쌤 풀이
     * */
    private int[] solution2(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return answer;
    }
}
