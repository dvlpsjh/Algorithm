package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("이분검색(이진탐색)")
/**
 * 이진 탐색(binary search)
 * 데이터가 정렬돼 있는 배열에서 특정한 값을 찾아내는 알고리즘.
 * 배열의 중간에 있는 임의의 값을 선택하여 찾고자 하는 값 X와 비교한다.
 * X가 중간값보다 작으면 중간값을 기준으로 좌측의 데이터들을 대상으로,
 * X가 중간값보다 크면 배열의 우측을 대상으로 다시 탐색.
 * 동일한 방법으로 다시 중간의 값을 임의로 선택하고 비교한다.
 * 해당 값을 찾을 때까지 상기 과정을 반복한다.
 *
 * */
public class Q0608 {
    public static void main(String[] args) {
        Q0608 t = new Q0608();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution2(m, arr));
    }

    private int solution2(int m, int[] arr) {
        Arrays.sort(arr);

        int answer = -1;
        int lt = 0;
        int rt = arr.length-1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if(m == arr[mid]) {
                answer = mid + 1;
                break;
            }
            if(m < arr[mid]) {
                rt = mid - 1;
            } else if(m > arr[mid]) {
                lt = mid + 1;
            }
        }

        return answer;
    }
}
