package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.*;
import java.util.stream.Collectors;

@Name("Least Recently Used")    // 캐시, 카카오변형 / LRU Alrogithm : 가장 오랫동안 참조되지 않은 페이지를 교체하는 기법(페이지 교체 알고리즘)
public class Q0604 {
    public static void main(String[] args) {
        Q0604 t = new Q0604();
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
            // hit or miss
            int pos = -1;   // index
            for (int i = 0; i < s; i++) {
                if(x==caches[i]) { // hit
                    pos = i;
                }
            }

            if (pos == -1) {    // miss
                for (int i = s - 1; i >= 1; i--) {
                    caches[i] = caches[i - 1];
                }
            } else { // hit
                for (int i = pos; i >= 1; i--) {
                    caches[i] = caches[i - 1];
                }
            }

            caches[0] = x;
        }

        return caches;
    }
}
