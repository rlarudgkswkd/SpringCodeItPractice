package org.example.Head02_OOPpragramming.topic03_OOPConcept.example02;

public class AccountTransferPayment extends AbstractPayment{

    @Override
    public void pay(double amount) {
        validatePayment(amount);
        System.out.println("계좌이체 결제 : "+ amount + "원 완료");
    }

    @Override
    public void cancel(double amount) {
        validateCancel(amount);
        System.out.println("계좌이체 결제 취소 : "+ amount + "원 완료");
    }
}
