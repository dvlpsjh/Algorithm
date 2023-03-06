package org.inflearn.javacote.chapter5;

import jdk.jfr.Name;
import java.util.*;

@Name("괄호문자제거")
public class Q0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> st = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x == ')') {
                while(st.pop() != '(');
            } else st.push(x);
        }

        for (int i = 0; i < st.size(); i++) sb.append(st.get(i));

        /* [내 풀이]
        for (char x : s.toCharArray()) {
            if(x == '(') st.push(x);
            else if(x == ')') {
                st.pop();
                continue;
            }

            if (st.isEmpty()) sb.append(x);
        }
        */

        return sb.toString();
    }
}
