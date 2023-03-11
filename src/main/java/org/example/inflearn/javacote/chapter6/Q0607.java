package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@Name("좌표 정렬")  // 좌표정렬 기술 익히기
public class Q0607 {
    public static void main(String[] args) {
        Q0607 t = new Q0607();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }

        Collections.sort(list);

        for(Point o : list) {
            System.out.println(o.x + " " + o.y);
        }
    }
}

// 외워서 하는 것
class Point implements Comparable<Point> {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) { // 정렬 기준 잡아주는 메서드
        // 오름차순 : this - object 순서에서 (-) 연산
        /*
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
        */

        // 내림차순 : object - this 순서에서 (-) 연산
        if(this.x == o.x) return o.y - this.y;
        else return o.x - this.x;
    }
}
