package org.example.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("문자열 압축")
public class Quiz0111 {

    public String solution(String s) {
        String answer = "";
        s = s + " ";    // 공백문자 추가로 idx 한칸 늘려주기
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) count++;
            else {
                answer += s.charAt(i);
                if(count > 1) answer += Integer.toString(count);
                count = 1;
            }
        }

        return answer;
    }

/* 사전 개인 풀이
    public String solution(String s) {
        String answer = "";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if(i == s.length() - 2) {
                if(s.charAt(i) == s.charAt(i+1)) {
                    count++;
                    answer += s.charAt(i) + String.valueOf(count);
                    continue;
                } else {
                    answer += s.charAt(i);
                    if(count > 1) answer += String.valueOf(count);
                    answer += s.charAt(i+1);
                }
                break;
            }

            if(s.charAt(i) == s.charAt(i+1)) count++;
            else {
                answer += s.charAt(i);
                if(count > 1) answer += String.valueOf(count);
                count = 1;
            }
        }

        return answer;
    }
*/
    public static void main(String[] args) {
        Quiz0111 m = new Quiz0111();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(m.solution(s));
        System.out.println("KST3SE2KFK3DJ2G2".equals(m.solution(s)));
    }
}
