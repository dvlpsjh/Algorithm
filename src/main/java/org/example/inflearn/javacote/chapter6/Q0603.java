package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.Arrays;
import java.util.Scanner;

@Name("삽입 정렬") // key 를 정해서
/**
 * insertion sort algorithm
 * 1. 손안의 카드를 정렬하는 방법과 유사하다.
 *  1-1. 새로운 카드를 기존의 정렬된 카드 사이의 올바른 자리를 찾아 삽입한다.
 *  1-2. 새로 삽입될 카드의 수만큼 반복하게 되면 전체 카드가 정렬된다.
 * 2. 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
 * 3. 매 순서마다 해당 원소를 삽입할 수 있는 위치를 찾아 해당 위치에 넣는다.
 * */
public class Q0603 {
    public static void main(String[] args) {
        Q0603 t = new Q0603();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    
        }
        
        for(int x : t.solution(arr)) System.out.print(x + " ");
    }

    private int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        // 삽입정렬 : 올리고 비교하고 큰수는 뒤로 밀고, 작은수는 앞에 넣고

        for (int i = 1; i < answer.length; i++) {
            int tmp = answer[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if(answer[j] > tmp) {
                    answer[j+1] = answer[j];
                } else break;   // !!해당 else 단락 안에 넣으면 tmp가 입력이 안되는 경우가 생겨서 해당 loop 밖에서 처리해줘야 함
            }

            arr[j+1] = tmp;
        }

        return answer;
    }
}
