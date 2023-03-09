package org.example.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Scanner;

@Name("보이는 학생")
public class Quiz0202 {
    public int solution(int[] heights) {
        int answer = 1;
        int max = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if(heights[i] > max) {
                answer++;
                max = heights[i];
            }
        }


        /* 이중for문 풀이 시간복잡도가 O(n^2)로 너무 커짐
        for (int i = 1; i < heights.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if(heights[i] <= heights[j]) {
                    flag = true;
                    break;
                }
            }

            if(!flag) answer++;
        }
        */

        return answer;
    }

    public static void main(String[] args) {
        Quiz0202 m = new Quiz0202();
        Scanner sc = new Scanner(System.in);

        int[] heights = new int[sc.nextInt()];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println(m.solution(heights));
    }
}
