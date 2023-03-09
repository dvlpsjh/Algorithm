package org.example.inflearn.javacote.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q0508R {
    public static void main(String[] args) {
        Q0508R t = new Q0508R();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(t.solution(arr, m));
    }

    private int solution(int[] arr, int m) {
        int answer = 0;
        Queue<Person> q = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            q.offer(new Person(i, arr[i]));
        }

        while (!q.isEmpty()) {
            Person tmp = q.poll();
            for (Person ps : q) {
                if(ps.priority > tmp.priority) {
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if(tmp != null) {
                answer++;
                if (m == tmp.id) return answer;
            }

        }

        return answer;
    }

    class Person {
        private int id;
        private int priority;

        Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }
}
