package org.example.inflearn.javacote.chapter6;

import jdk.jfr.Name;

import java.util.*;
import java.util.stream.Collectors;

@Name("중복 확인")
public class Q0605 {
    public static void main(String[] args) {
        Q0605 t = new Q0605();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(t.solution3(n, arr));
    }

    // Stream
    private String solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));

        for(int x : arr) {
            if(list.contains(x)) return "D";
        }

        return "U";
    }

    // hashMap
    private String solution2(int n, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if(map.get(x) > 1) return "D";
        }

        return "U";
    }

    // 정렬 T(n) = O(NlogN)
    private String solution3(int n, int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }

        return "U";
    }
}
