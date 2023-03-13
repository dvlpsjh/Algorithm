package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

@Name("올바른 괄호 - 복습") // stack
public class Q0501R {
    public static void main(String[] args) {
        Q0501R t = new Q0501R();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(t.solution(str));
    }

    private String solution(String str) {
        Stack<Character> stk = new Stack<>();

        for (char x : str.toCharArray()) {
            if(x == '(') {
                stk.push(x);
            } else {
                if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    return "NO";
                }
            }
        }

        return stk.isEmpty() ? "YES" : "NO";
    }
}
