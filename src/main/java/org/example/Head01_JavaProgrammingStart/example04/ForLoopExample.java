package org.example.Head01_JavaProgrammingStart.example04;

public class ForLoopExample {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        //초기식, 조건식, 증감식 포함
        for (int i = 0; i < 6; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("  j: " + j);
            }
//            System.out.println("i: " + i);
        }


    }
}
