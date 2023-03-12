package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

@Name("후위식 연산 - 복습")
public class Q0504R {
    public static void main(String[] args) {
        Q0504R t = new Q0504R();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(t.solution(s));
    }

    private int solution(String s) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                stk.push((int)x - 48);
            } else {
                int rt = stk.pop();
                int lt = stk.pop();

                int result = 0;

                switch (x) {
                    case '+' : result = lt + rt; break;
                    case '-' : result = lt - rt; break;
                    case '*' : result = lt * rt; break;
                    case '/' : result = lt / rt; break;
                }

                stk.push(result);
            }
        }

        return stk.pop();
    }

}
