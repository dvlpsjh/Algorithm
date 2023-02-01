package org.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("숫자만 추출")
public class Quiz0109 {

    /* Character.isDigit() 활용 */
    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) {    // ** Character.isDigit(ch) : ch가 숫자인지 판별
                answer += x;
            }
        }

        return Integer.parseInt(answer);

        /* 식으로 풀기
        int answer = 0;
        for (char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) {    // 아스키번호 자주 쓰는건 외워두면 좋음
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
        */

        /* replaceAll() 정규식 이용한 풀이
        str = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(str);
        */

        /* 아스키코드 활용
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(48 <= (int) c && (int) c <= 57) answer.append(c);
        }

        return answer.length() > 0 ? Integer.parseInt(answer.toString()) : 0;
        */
    }

    public static void main(String[] args) {
        Quiz0109 m = new Quiz0109();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(m.solution(str));
    }
}
