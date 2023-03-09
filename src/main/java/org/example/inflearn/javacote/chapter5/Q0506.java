package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.*;

@Name("공주 구하기") // Queue 문제
public class Q0506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(cnt, k));
    }

    private static int solution(int cnt, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= cnt; i++) q.offer(i);

        int idx = 1;
        while(q.size() > 1) {
            if(idx != k) {
                q.offer(q.poll());
                idx++;
            } else {
                q.poll();
                idx = 1;
            }
        }

        return q.poll();
    }

    /**
     * 쌤 풀이
     * */
    private static int solution2(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);

        while (!q.isEmpty()) {
            for (int i = 1; i < k; i++) q.offer(q.poll());
            q.poll();

            if(q.size() == 1) answer = q.poll();
        }

        return answer;
    }
}
