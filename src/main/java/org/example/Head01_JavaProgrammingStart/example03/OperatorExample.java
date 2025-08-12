package org.example.Head01_JavaProgrammingStart.example03;

public class OperatorExample {
    public static void main(String[] args) {
        double temperature = 20;
        String gender = "dd";
//        if(temperature > 40){
//            System.out.println("폭염입니다. ");
//            if(gender.equals("male")){
//                System.out.println("남자인데");
//            } else {
//                System.out.println("여자인데");
//            }
//        } else if(temperature <= 40 && temperature > 20){
//            System.out.println("So Hot ");
//            if(gender.equals("male")){
//                System.out.println("남자인데");
//            } else {
//                System.out.println("여자인데");
//            }
//        } else if(temperature <= 20 && temperature > 10) {
//            System.out.println("So fresh , So cool");
//            if(gender.equals("male")){
//                System.out.println("남자인데");
//            } else {
//                System.out.println("여자인데");
//            }
//        } else {
//            System.out.println("Freezing Cold");
//            if(gender.equals("male")){
//                System.out.println("남자인데");
//            } else {
//                System.out.println("여자인데");
//            }
//        }

        switch (gender) {
            case "female":
                System.out.println("여자인데");
                break;
            case "male":
                System.out.println("남자인데");
                break;
            default:
                // 어떤 case에도 해당하지 않을 때 실행
                System.out.println("누구세요");
        }

    }
}
