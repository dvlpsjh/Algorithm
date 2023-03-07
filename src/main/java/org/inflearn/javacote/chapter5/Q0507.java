package org.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

@Name("교육과정 설계") // Queue
public class Q0507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();  // 필수과목
        String s2 = sc.next();  // 수업계획

        /**
           입력예제
            CBA
            CBDAGE
         * */

        System.out.println(solution2(s1, s2));
    }

    private static String solution(String s1, String s2) {
        Queue<Character> necessary = new LinkedList<>();
        for (char x : s1.toCharArray()) necessary.offer(x);

        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == necessary.peek()) necessary.poll();
            if(necessary.isEmpty()) return "YES";
        }

        return "NO";
    }

    /**
     * 쌤 풀이
     * */
    private static String solution2(String need, String plan) {
        Queue<Character> q = new LinkedList<>();
        for (char x : need.toCharArray()) q.offer(x);
        for (char x : plan.toCharArray()) {
            if(q.contains(x)) {
                if(x != q.poll()) return "NO";
            }
        }

        return q.isEmpty() ? "YES" : "NO";
    }
}
