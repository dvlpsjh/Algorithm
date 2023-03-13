package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("마굿간 정하기(결정 알고리즘")
public class Q0610 {
    public static void main(String[] args) {
        Q0610 t = new Q0610();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 마굿간 수
        int c = sc.nextInt();   // 말 수

        int[] arr = new int[n]; // 마굿간 좌표
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, c, arr));

    }

    private int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[ n - 1];

        while (lt <= rt) {
            int mid = (lt+rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    // 결정알고리즘은 유효성 판별 함수 만드는게 능력임(이게 필요함)
    private int count(int[] arr, int dist) {    // dist : distance : 가장 가까운 말 거리를 이걸로 정하겠다는 뜻
        int cnt = 1;        // 말의 마리수
        int ep = arr[0];    // 말의 배치 엔드포인트

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }
}
