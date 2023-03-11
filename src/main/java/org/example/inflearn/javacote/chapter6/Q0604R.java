package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("LRU 복습") // Least Recently Used : 페이징 교체기법
public class Q0604R {
    public static void main(String[] args) {
        Q0604R t = new Q0604R();
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] works = new int[n];

        for (int i = 0; i < n; i++) {
            works[i] = sc.nextInt();
        }

        for(int x : t.solution(s, n, works)) System.out.print(x + " ");
    }

    private int[] solution(int s, int n, int[] works) {
        int[] caches = new int[s];
        for (int x : works) {

            int pos = -1;
            for (int i = 0; i < s; i++) {
                if(caches[i] == x) pos = i; // cache hit
            }

            if(pos == -1) { // miss
                for (int i = s - 1; i >= 1; i--) {
                    caches[i] = caches[i-1];
                }
            } else { // hit
                for (int i = pos; i >= 1; i--) {
                    caches[i] = caches[i-1];
                }
            }

            caches[0] = x;
        }

        return caches;
    }
}
