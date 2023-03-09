package org.example.inflearn.javacote.chapter3;

import jdk.jfr.Name;

import java.util.*;

@Name("공통원소 구하기")
public class Quiz0302 {
    public List<Integer> solution(int n1, int[] arr1, int n2, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int n : arr1) map.put(n, 0);

        for (int i = 0; i < n2; i++) {
            if (map.containsKey(arr2[i])) answer.add(arr2[i]);
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Quiz0302 m = new Quiz0302();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        for(int x : m.solution(n1, arr1, n2, arr2)) System.out.print(x + " ");
    }

}
