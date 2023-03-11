package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("장난꾸러기")
public class Q0606 {
    public static void main(String[] args) {
        Q0606 t = new Q0606();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : t.solution(n, arr)) System.out.print(x + " ");
    }

    private int[] solution(int n, int[] arr) {
        int[] copyOfArr = arr.clone();  // 깊은 복사
        int[] answer = new int[2];
        Arrays.sort(copyOfArr);

        int idx = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != copyOfArr[i]) {
                answer[idx] = i + 1;
                if(idx > 0) break;
                idx++;
            }
        }

        return answer;
    }
}
