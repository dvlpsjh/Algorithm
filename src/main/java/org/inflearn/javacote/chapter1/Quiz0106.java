package org.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.*;

@Name("중복문자제거")
public class Quiz0106 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        /* indexOf() 활용 풀이 */
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i))) answer.append(str.charAt(i));
        }

        /* ArrayList 활용
        StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for(char c : str.toCharArray()) {
            if(!list.contains(c)) list.add(c);
        }

        for(char c : list) answer.append(c);
        */

        return answer.toString();

    }

    public static void main(String[] args) {
        Quiz0106 m = new Quiz0106();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(m.solution(str));
    }
}
