package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("마굿간 정하기(결정 알고리즘)")
public class Q0610R {
    public static void main(String[] args) {
        Q0610R t = new Q0610R();
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
        Arrays.sort(arr);
        int answer = 0;
        int lt = 1;
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }

        return answer;
    }

    int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }
}
