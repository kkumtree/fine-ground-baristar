package assignment;

public class PrintOrder {
    public static void main(String[] args) {
        OrderDetail newOrder = new OrderDetail();
        newOrder.orderNumber = 201907210001L;
        newOrder.orderDateYear = 2019;
        newOrder.orderDateMonth = 7;
        newOrder.customerName = "홍길순";
        newOrder.orderDateDay = 21;
        newOrder.itemNumber = "PD0345-12";
        newOrder.address= "서울시 영등포구 여의도동 20번지";
        newOrder.getOrderDetail();
    }
}
