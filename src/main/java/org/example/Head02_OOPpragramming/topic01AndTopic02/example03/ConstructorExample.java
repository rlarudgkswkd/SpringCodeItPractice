package org.example.Head02_OOPpragramming.topic01AndTopic02.example03;

public class ConstructorExample {
    public static void main(String[] args) {

        //int , long
        //선언, 초기화
        int num = 1;
        // -> 타입이 int(정수형)인 num이라는 변수를 선언할거고 거기에 정수 1로 초기화할거야.
        String str1 = "문자열1";

        //Order클래스 -> 객체 생성 -> 생성자 , 생성자 메소드
        //타입이 Order 클래스 인 order1이라는 이름의 변수를 선언할거고 거기에 new Order()
        //(Order클래스의 생성자) 를 통해 초기화 할거야(생성할거야).
        Order order1 = new Order(str1);
        Product product1 = new Product("d","d",109);



        System.out.println();





//        // 1. 기본 생성자 사용
//        Order order1 = new Order();
//        System.out.println("order1 ID: " + order1.getOrderId());
//        System.out.println("order1 isPaid: " + order1.isPaid());
//
//        // 2. orderId만 전달하는 생성자 사용
//        Order order2 = new Order("ORD001");
//        System.out.println("order2 ID: " + order2.getOrderId());
//
//        // 3. orderId와 상품 목록을 전달하는 생성자 사용
//        List<Product> productList = new ArrayList<>();
//        productList.add(new Product("P001", "Laptop", 1200.0));
//        productList.add(new Product("P002", "Mouse", 25.0));
//
//        Order order3 = new Order("ORD002", productList);
//        System.out.println("order3 ID: " + order3.getOrderId());
//        System.out.println("order3 products: ");
//        for (Product p : order3.getProducts()) {
//            System.out.println("- " + p.getName() + " ($" + p.getPrice() + ")");
//            System.out.println(p);
//        }
    }
}