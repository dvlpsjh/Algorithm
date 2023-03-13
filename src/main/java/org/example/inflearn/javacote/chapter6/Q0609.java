package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("뮤직비디오(결정알고리즘)") // 결정 알고리즘 : 이분검색을 이용
public class Q0609 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Q0609 t = new Q0609();
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
        // reduction ?
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    private int count(int[] arr, int capacity) {
        int cnt = 1;    // DVD장수
        int sum = 0;    // DVD에 담아내는 곡들의 합

        for (int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }

        return cnt;
=======

>>>>>>> 1c092783b70602237d40c4fcc7282f48c59f6d8b
    }
}
