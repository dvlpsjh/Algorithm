package org.example.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("소수(에라토스테네스의 체 - 소수 구하는 방법 중 제일 빠름)")
public class Quiz0205 {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];    // 인덱스가 n번까지 생겨야 하므로
        for (int i = 2; i <= n; i++) {
            if(ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) ch[j] = 1;
            }
        }

        /** for문을 이용한 소수 판별 */
        boolean isPrime = true;
        int num = 13;

        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        /** 제곱근 활용 소수 판별 */
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        String result = isPrime ? "소수입니다." : "소수가 아닙니다.";

        return answer;
    }

    public static void main(String[] args) {
        Quiz0205 m = new Quiz0205();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(m.solution(n));
    }
}
