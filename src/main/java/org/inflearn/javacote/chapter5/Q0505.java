package org.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

@Name("쇠막대기") // *** 혼자서 다시 한번 꼭 해보기
public class Q0505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // 예시입력1 : ()(((()())(())()))(())
        // 예시입력2 : (((()(()()))(())()))(()())

        System.out.println(solution(s));
    }

    private static int solution(String s) {
        int answer = 0;
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stk.push(s.charAt(i));
            else {
                stk.pop();
                if(s.charAt(i-1) == '(') answer += stk.size(); // this is laser
                else answer += 1; // this is not laser
            }
        }

        return answer;
    }

    /**
     * 쌤 풀이
     * */
    public static int solution2(String s) {
        int answer = 0;
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stk.push('(');
            else {
                stk.pop();
                if(s.charAt(i - 1) == '(') answer += stk.size();
                else answer++;
            }
        }

        return answer;
    }
}
