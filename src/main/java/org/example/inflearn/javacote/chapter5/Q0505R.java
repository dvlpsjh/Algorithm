package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

@Name("쇠막대기 - 복습")  // stack
// 이거 다시 해야 함
public class Q0505R {
    public static void main(String[] args) {
        Q0505R t = new Q0505R();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(t.solution(s));
    }

    private int solution(String s) {
        Stack<Character> stk = new Stack<>();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stk.push(s.charAt(i));
            } else {
                stk.pop();
                if(s.charAt(i - 1) == '(') {
                    answer += stk.size();
                } else {
                    answer += 1;
                }
            }
        }

        return answer;
    }
}
