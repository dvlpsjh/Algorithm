package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

@Name("괄호문자제거 - 복습")
public class Q0502R {
    public static void main(String[] args) {
        Q0502R t = new Q0502R();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(t.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        Stack<Character> stk = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x == ')') {
                while(true) {
                    if(stk.pop() == '(') break;
                }
            } else stk.push(x);
        }

        for (char x : stk) answer += x;

        return answer;
    }
}
