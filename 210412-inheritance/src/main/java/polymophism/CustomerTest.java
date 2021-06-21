package polymophism;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        /*
        // 상위클래스로의 묵시적 형변환
       Customer customerCho = new VIPCustomer(77777, '민초굿')
         */

        VIPCustomer customerKim = new VIPCustomer(0, null);
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
