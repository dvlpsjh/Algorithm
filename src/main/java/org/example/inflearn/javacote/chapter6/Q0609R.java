package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("결정 알고리즘 - 복습")
public class Q0609R {
    public static void main(String[] args) {
        Q0609R t = new Q0609R();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public int count(int[] arr, int capacity) {
        int cnt = 1;    // DVD장수
        int sum = 0;    // DVD에 담아내는 곡들의 합

        for (int x : arr) {
            if(sum + x <= capacity) {
                sum += x;
            } else {
                cnt++;
                sum = x;
            }
        }

        return cnt;
    }
}
