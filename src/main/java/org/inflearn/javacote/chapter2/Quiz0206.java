package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.*;

@Name("뒤집은 소수")
public class Quiz0206 {

    public boolean isPrime(int num) {
        if(num == 1) return false;

        for (int j = 2; j <= Math.sqrt(num); j++) {
            if(num % j == 0) return false;
        }

        return true;
    }

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            /** StringBuilder 및 Integer class (라이브러리) 활용
            int num = Integer.parseInt(new StringBuilder(Integer.toString(arr[i])).reverse().toString());
            */

            /** 보다 수학적인 풀이 */
            int num = 0;
            int tmp = arr[i];
            while(tmp > 0) {
                int t = tmp % 10;
                num = num * 10 + t;
                tmp = tmp / 10;
            }

            if(isPrime(num)) answer.add(num);
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0206 m = new Quiz0206();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for(int num : m.solution(n, arr)) System.out.print(num + " ");
    }
}
