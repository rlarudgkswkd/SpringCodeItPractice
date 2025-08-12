package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        int score = 85;
//        String result;
//        if(score >= 90){
//            result = "A학점";
//        } else {
//            result = "B학점";
//        }

//
//
        String result = (score >= 90) ? "A학점" : "B학점";

        System.out.println("결과: " + result);  // 결과: B학점



    }
}