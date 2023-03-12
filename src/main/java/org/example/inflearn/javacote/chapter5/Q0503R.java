package org.example.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.Scanner;
import java.util.Stack;

@Name("크레인 인형뽑기 - 복습")
public class Q0503R {
    public static void main(String[] args) {
        Q0503R t = new Q0503R();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(t.solution(n, board, m, moves));
    }

    private int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < m; i++) {
            int idx = moves[i] - 1;
            int catched = -1;

            for (int j = 0; j < n; j++) {
                if(board[j][idx] != 0) {
                    catched = board[j][idx];
                    board[j][idx] = 0;
                    break;
                }
            }

            if(!stk.isEmpty() && stk.peek() == catched) {
                answer += 2;
                stk.pop();
            } else stk.push(catched);
        }

        return answer;
    }
}
