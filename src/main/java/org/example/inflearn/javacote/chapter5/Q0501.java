package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;
import java.util.*;

// 스택, 큐(자료구조)
@Name("올바른 괄호(스택 대표적 문제)")
public class Q0501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        Stack<Character> st = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x == '(') st.push(x);
            else {
                if(st.isEmpty()) return "NO";
                else st.pop();
            }
        }

        return st.isEmpty() ? "NO" : "YES";
    }
}
