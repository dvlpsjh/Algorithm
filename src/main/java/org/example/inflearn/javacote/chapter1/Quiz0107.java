package org.example.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("회문 문자열")
public class Quiz0107 {

    public String solution(String str) {
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if(str.charAt(i) != str.charAt(len - 1 - i)) {
                return "NO";
            }
        }

        return "YES";

        /* reverse() 활용
        str = str.toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();

        // ** equalsIgnoreCase() 활용 : reversed.equalsIgnoreCase(str) ? "YES" : "NO";
        return reversed.equals(str) ? "YES" : "NO";
         */
    }

    public static void main(String[] args) {
        Quiz0107 m = new Quiz0107();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(m.solution(str));
    }
}
