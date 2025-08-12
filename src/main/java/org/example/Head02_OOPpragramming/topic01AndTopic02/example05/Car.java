package org.example.Head02_OOPpragramming.topic01AndTopic02.example05;

import java.time.Year;

public class Car {
    private final String manufacturer;    //  제조사
    private final String type;            //  차종
    private final Long price;             //  가격
    private final Year modelYear;         //  연식

    public Car(
            String manufacturer,
            String type,
            Long price,
            Year modelYear
    ) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.price = price;
        this.modelYear = modelYear;
    }

    public void changeGear() {
        System.out.println("기어 변경 행동을 한다.");
        changeGear();
    }

    public void turnHandle() {
        System.out.println("핸들 조작 행동을 한다.");
    }

    public void adjustSpeed() {
        System.out.println("가속 행동을 한다.");
    }

    // a -> 문자열
    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", modelYear=" + modelYear +
                '}';
    }
}
