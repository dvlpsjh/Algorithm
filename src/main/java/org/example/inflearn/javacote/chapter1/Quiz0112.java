package org.example.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("암호")
public class Quiz0112 {

    /* substring과 replace 활용해 더 직관적인 코드 작성 가능함 */
    public String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    /* 개인적인 풀이
    public String solution(int n, String str) {
        String answer = "";
        String[] words = new String[n];
        int idx = 0;

        for (int i = 0; i < str.length(); i++) {
            if((i+1) % 7 == 0) {
                String s = str.substring(i - 6, i + 1);
                String bin = "";

                for (int j = 0; j < s.length(); j++) {
                    if(s.charAt(j) == '#') bin += '1';
                    else if(s.charAt(j) == '*') bin += '0';
                }

                int ascii = Integer.valueOf(bin, 2);
                answer += (char) ascii;
            }
        }

        return answer;
    }
     */

    public static void main(String[] args) {
        Quiz0112 m = new Quiz0112();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(m.solution(n, str));
    }
}
