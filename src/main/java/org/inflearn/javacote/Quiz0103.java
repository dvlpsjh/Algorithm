package org.inflearn.javacote;

import java.util.Scanner;

public class Quiz0103 {

    /* 일반적인 풀이
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] words = str.split(" ");

        for(String x : words) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }*/

    // indexOf()를 활용한 풀이
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(' ')) != -1) { // 띄어쓰기 발견 못할 시 -1 리턴, 발견시 그 인덱스번호 리턴함
            String tmp = str.substring(0, pos);
            int len = tmp.length();

            if(len > m) {
                m = len;
                answer = tmp;
            }

            str = str.substring(pos + 1);

            if(str.length() > m) answer = str;
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0103 m = new Quiz0103();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("== answer : " + m.solution(str));
    }
}
