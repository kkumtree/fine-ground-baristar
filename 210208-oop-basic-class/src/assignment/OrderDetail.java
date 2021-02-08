package assignment;

public class OrderDetail {
    long orderNumber;
    int customerID;
    int orderDateYear;
    int orderDateMonth;
    int orderDateDay;
    String customerName;
    String itemNumber;
    String address;
    public void getOrderDetail (){
        System.out.println("주문번호 : " + orderNumber);
        System.out.println("주문자 아이디 : " + customerID);
        System.out.println("주문 날짜 : " + orderDateYear + "년 " + orderDateMonth + "월 " + orderDateDay + "일");
        System.out.println("주문자 이름 : " + customerName);
        System.out.println("주문 상품 번호 : " + orderNumber);
        System.out.println("배송 주소 : " + address);
    }
}
