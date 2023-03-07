package org.inflearn.javacote.chapter5;

import jdk.jfr.Name;

import java.util.*;

// Stack
@Name("크레인 인형뽑기(카카오)")
public class Q0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) board[i][j] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) moves[i] = sc.nextInt();

        System.out.println(solution3(board, moves));
    }

    // solve 1 -- pass (** 이게 미세하게 더 빠름)
    private static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        List<Stack<Integer>> stacks = new ArrayList<>();
        Stack<Integer> box = new Stack<>();

        for (int i = 0; i < n; i++) {
            Stack<Integer> stk = new Stack<>();
            for (int j = 0; j < n; j++) {
                if (board[n - j - 1][i] != 0) stk.push(board[n - j - 1][i]);
            }
            stacks.add(stk);
        }

        for (int i = 0; i < m; i++) {
            Stack<Integer> st = stacks.get(moves[i] - 1);
            if (!st.isEmpty()) {
                int pop = st.pop();
                if (!box.isEmpty()) {
                    if (box.peek() == pop) {
                        box.pop();
                        answer += 2;
                        continue;
                    }
                }
                box.push(pop);
            }
        }

        return answer;
    }

    // solve 2 -- pass
    private static int solution2(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> box = new Stack<>();

        for (int i = 0; i < m; i++) {
            int pos = moves[i];
            for (int j = 0; j < n; j++) {
                int num = board[j][pos - 1];
                if (num != 0) {
                    if (!box.isEmpty() && box.peek() == num) {
                        box.pop();
                        board[j][pos - 1] = 0;
                        answer += 2;
                    } else {
                        box.push(num);
                        board[j][pos - 1] = 0;
                    }
                    break;
                }
            }
        }

        return answer;
    }

    /** 쌤 답안 */
    public static int solution3(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else stack.push(tmp);

                    break;
                }
            }
        }

        return answer;
    }
}
