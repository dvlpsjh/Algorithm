package org.example.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("유효한 팰린드롬")
public class Quiz0108 {
    // found7, time: study; Yduts; emit, 7Dnuof
    public String solution(String str) {
        // 정규식 쓸 땐 replaceAll(), replace()는 정규식 못씀
        str = str.toUpperCase().replaceAll("[^A-Z]", ""); // * ^ : 꺽쇠는 부정

        return str.equals(new StringBuilder(str).reverse().toString()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Quiz0108 m = new Quiz0108();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(m.solution(str));
    }
}
