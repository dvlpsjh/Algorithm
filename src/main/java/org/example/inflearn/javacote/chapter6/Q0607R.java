package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@Name("좌표 정렬")
public class Q0607R {
    public static void main(String[] args) {
        Q0607R t = new Q0607R();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        ArrayList<Point> solutions = t.solution(n, points);

        for (Point o : solutions) {
            System.out.println(o.x + " " + o.y);
        }
    }

    private ArrayList<Point> solution(int n, int[][] points) {
        ArrayList<Point> pList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            pList.add(new Point(points[i][0], points[i][1]));
        }

        Collections.sort(pList);

        return pList;
    }

    class Point implements Comparable<Point> {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y - o.y;
            else return this.x - o.x;
        }
    }

}
