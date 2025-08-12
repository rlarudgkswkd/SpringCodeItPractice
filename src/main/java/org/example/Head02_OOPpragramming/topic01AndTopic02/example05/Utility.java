package org.example.Head02_OOPpragramming.topic01AndTopic02.example05;

public class Utility {
    public static final double DISCOUNT_RATE;

    static {
        // 정적 초기화 블록
        // 클래스가 처음 로드될 때 **한 번만 실행되는 블록**
        // 복잡한 초기화 작업에 사용됨
        DISCOUNT_RATE = 0.05;
    }

    public static double applyDiscount(double price) {
        return price - (price * DISCOUNT_RATE);
    }
}
