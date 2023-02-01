package org.inflearn.javacote;

import jdk.jfr.Name;

import java.util.ArrayList;
import java.util.Scanner;

@Name("단어 뒤집기")
public class Quiz0104 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String s : str) {
            char[] ch = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while (lt < rt) {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(ch);
            answer.add(tmp);
        }


        /* StringBuilder 활용한 뒤집기
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        */

        return answer;
    }

    public static void main(String[] args) {
        Quiz0104 m = new Quiz0104();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strs = new String[num];

        for (int i = 0; i < num; i++) {
            strs[i] = sc.next();
        }

        for(String s : m.solution(num, strs)) {
            System.out.println(s);
        }

    }
}
