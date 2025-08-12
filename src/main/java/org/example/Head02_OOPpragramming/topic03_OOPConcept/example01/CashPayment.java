package org.example.Head02_OOPpragramming.topic03_OOPConcept.example01;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        //현금 결제에 필요한 로직
        System.out.println("현금결제로 " + amount + "원 결제 완료.");
    }
}
