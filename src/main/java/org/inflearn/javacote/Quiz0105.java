package org.inflearn.javacote;

import java.util.Scanner;

public class Quiz0105 {
    public String solution(String str) {
        int lt = 0, rt = str.length()-1;
        char[] c = str.toCharArray();

        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[rt];
                c[rt] = c[lt];
                c[lt] = tmp;

                lt++;
                rt--;
            }

            /* 아스키코드 활용
            if(!(65 <= (int) c[lt] && (int) c[lt] <= 90)
                    && !(97 <= (int) c[lt] && (int) c[lt] <= 122)) {
                lt++;
                continue;
            }

            if(!(65 <= (int) c[rt] && (int) c[rt] <= 90)
                    && !(97 <= (int) c[rt] && (int) c[rt] <= 122)) {
                rt--;
                continue;
            }

            char tmp = c[rt];
            c[rt] = c[lt];
            c[lt] = tmp;

            lt++;
            rt--;
            */
        }

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Quiz0105 m = new Quiz0105();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(m.solution(str));
    }
}
