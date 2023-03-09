package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

// 중위식 -> 후위식 만드는 것 구글링 해봐라
@Name("후위식 연산(postfix)")
public class Q0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(solution2(s));
    }

    private static int solution(String s) {
        Stack<Integer> stk = new Stack<>();

        for (char x : s.toCharArray()) {
            if((int) x >= 47 && (int) x <= 57) {
                stk.push(Integer.parseInt(Character.toString(x)));
            } else {
                int rt = stk.pop();
                int lt = stk.pop();

                if(x == '+') stk.push(lt + rt);
                else if(x == '-') stk.push(lt - rt);
                else if(x == '*') stk.push(lt * rt);
                else if(x == '/') stk.push(lt / rt);
            }
        }

        return stk.pop();
    }

    /**
     * 쌤 풀이
     */
    private static int solution2(String s) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) {  // Character.toDigit(arg) --> 이 character가 숫자인지 판별해주는 메소드
                stk.push(x - 48);
            } else {
                int rt = stk.pop();
                int lt = stk.pop();

                if(x == '+') stk.push(lt + rt);
                else if(x == '-') stk.push(lt - rt);
                else if(x == '*') stk.push(lt * rt);
                else if(x == '/') stk.push(lt / rt);
            }
        }

        return answer = stk.get(0);
    }
}
