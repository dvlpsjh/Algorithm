package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("점수계산")
public class Quiz0207 {

    /** cnt, sum 변수 누적 활용한 선생님 풀이 --> 훨씬 간결하고 성능도 좋네 */
    public int solution(int n, int[] arr) {
        int sum = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                sum += cnt;
            } else cnt = 0;
        }

        return sum;
    }


    /** StringBuilder를 활용한 개인적 풀이 */
    public int solution2(int n, int[] arr) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int x : arr) sb.append(Integer.toString(x));

        String[] strs = sb.toString().split("0");

        for (int i = 0; i < strs.length; i++) {
            int len = strs[i].trim().length();
            if(len > 0) {
                for (int j = 1; j <= len; j++) answer += j;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0207 m = new Quiz0207();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(m.solution(n, arr));
    }
}
