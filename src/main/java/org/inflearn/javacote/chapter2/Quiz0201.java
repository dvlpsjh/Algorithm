package org.inflearn.javacote.chapter2;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("큰 수 출력하기")
public class Quiz0201 {

    public String solution(int[] nums) {
        String result = String.valueOf(nums[0]) + " ";

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                result += nums[i];
                if(i < nums.length-1) result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Quiz0201 m = new Quiz0201();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- 갯수 입력 --");
        int n = sc.nextInt();
        int[] inputs = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("-- 숫자 입력 --");
            inputs[i] = sc.nextInt();
        }

        System.out.println(m.solution(inputs));
    }
}
