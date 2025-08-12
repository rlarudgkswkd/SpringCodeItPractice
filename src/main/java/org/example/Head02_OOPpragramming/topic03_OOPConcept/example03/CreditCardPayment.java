package org.example.Head02_OOPpragramming.topic03_OOPConcept.example03;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        if(amount <= 10000){
            System.out.println("신용카드 소액 결제 : "+ amount+"원");
        } else if(amount <= 1000000){
            System.out.println("신용카드 중간 금액 결제 : "+ amount+"원");
        } else {
            System.out.println("신용카드 고액 결제 : "+ amount+"원");
        }
    }
}
