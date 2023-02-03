package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("가위 바위 보")
public class Quiz0203 {
    public void solution(int n, int[] a, int[] b) {
        for (int i = 0; i < n; i++) {
            String result = "";

            if(a[i] == 3 && b[i] == 1) result = "B";
            else if(a[i] == 1 && b[i] == 3) result = "A";
            else if(a[i] == b[i]) result = "D";
            else {
                if(a[i] > b[i]) result = "A";
                else result = "B";
            }

            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Quiz0203 m = new Quiz0203();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        m.solution(n, a, b);
    }
}
