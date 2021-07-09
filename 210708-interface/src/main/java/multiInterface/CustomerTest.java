package multiInterface;

//인터페이스를 어떤 것을 오픈해주는 건지에 따라서 해당 일부 인터페이스만 이용할 수도 있다.

public class CustomerTest {
    public static void main(String[] args) {
        // 여기서 sell과 buy 재정의 되기 때문에 밑에서도 재정의된 seller의 order가 호출된다.
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer; //상위로 묵시적 형변환
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
