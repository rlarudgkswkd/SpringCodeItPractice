package org.example.Head01_JavaProgrammingStart.example08;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
//                System.out.println("i % 2 == 0 : " + i);  // 홀수만 출력
                continue;
            }
            System.out.println(i);  // 홀수만 출력
        }
    }
}
