package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("선택 정렬")  // 오름차순
/**
 *  selection sort algorithm
 *  1. 제자리 정렬(in-place sorting) : 입력 배열(정렬x) 이외에 다른 추가 메모리를 요구하지 않는 정렬 방법
 *  2. 해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을 지 선택하는 알고리즘
 *      2-1. 첫번째 순서에는 첫번째 위치에서 가장 최솟값을 넣는다.
 *      2-2. 두번째 순서에는 두번째 위치에 남은 값 중에서의 최솟값을 넣는다.
 *  3. 과정 설명
 *      3-1. 주어진 배열 중에서 최솟값을 찾는다.
 *      3-2. 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass))
 *      3-3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
 *      3-4. 하나의 원소만 남을 때까지 위의 1~3 과정을 반복한다.
 *  4. T(n) = O(n^2)
 * */
public class Q0601 {

    public static void main(String[] args) {
        Q0601 t = new Q0601();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : t.solution2(arr)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < answer.length; i++) {
            int minIdx = i;
            int tmp = 0;
            for (int j = i; j < answer.length; j++) {
                if(answer[minIdx] > answer[j]) minIdx = j;
            }

            tmp = answer[i];
            answer[i] = answer[minIdx];
            answer[minIdx] = tmp;
        }

        return answer;
    }

    /**
     * 쌤 풀이
     * */
    private int[] solution2(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < answer.length - 1; i++) {   // 끝까지 안가도 돼서 전체 배열길이 -1
            int idx = i;
            for (int j = i + 1; j < answer.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }

                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            }
        }

        return answer;
    }
}
