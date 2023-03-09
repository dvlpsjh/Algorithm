package org.example.fntest;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        OptionalPractice op = new OptionalPractice();
        op.solution();
    }

    public void solution() {


    }

    class Person {
        private Long id;
        private String name;

        public Person() {}

        public Person(Long id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
