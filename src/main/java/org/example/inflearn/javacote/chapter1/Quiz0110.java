package org.example.inflearn.javacote.chapter1;

import jdk.jfr.Name;

import java.util.*;

@Name("가장 짧은 문자거리")
public class Quiz0110 {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int num = 1000;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                num = 0;
                answer[i] = num;
            } else {
                num++;
                answer[i] = num;
            }
        }

        num = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == c) {
                num = 0;
                continue;
            } else {
                num++;
                //if(answer[i] > num) answer[i] = num;
                answer[i] = Math.min(answer[i], num);
            }
        }

        return answer;
    }

    /* char의 index를 담은 List 활용 _ 개인적인 풀이
    public String solution(String str, char c) {
        String answer = "";
        String newStr = str;
        int pos;
        int startIdx = 0;

        List<Integer> list = new ArrayList<>();
        while((pos = newStr.indexOf(c, startIdx)) != -1) {
            list.add(pos);
            startIdx = pos + 1;
        }

        for (int i = 0; i < str.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < list.size(); j++) {
                if(Math.abs(list.get(j) - i) < min) {
                    min = Math.abs(list.get(j) - i);
                }
            }

            answer += min;
            if(i < str.length() - 1) answer += " ";
        }

        return answer;
    }
    */

    public static void main(String[] args) {
        Quiz0110 m = new Quiz0110();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(m.solution(str, c));
    }
}
