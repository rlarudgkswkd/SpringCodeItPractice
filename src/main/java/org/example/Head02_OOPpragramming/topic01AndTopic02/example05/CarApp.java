package org.example.Head02_OOPpragramming.topic01AndTopic02.example05;
import java.time.Year;

public class CarApp {
    public static void main(String[] args) {
        Year thisYear = Year.now();
        Car car = new Car("영민 컴퍼니", "포르쉐", 10000000L, thisYear);
        car.adjustSpeed();
    }
}
