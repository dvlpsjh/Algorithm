package org.example.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("등수 구하기")
public class Quiz0208 {

    /** 선생님 풀이 */
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }

            answer[i] = cnt;
        }

        return answer;
    }

    public int[] solution2(int n, int[] scores) {
        int[] answer = new int[n];
        int[] copied = Arrays.copyOf(scores, scores.length);

        Arrays.sort(copied);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(scores[i] == copied[j]) answer[i] = n - j;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz0208 m = new Quiz0208();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();

        for(int x : m.solution(n, scores)) System.out.print(x + " ");
    }
}
