package witharraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldCustomerTest {

    @Test
    void discountPrice() {
        GoldCustomer testCustomer = new GoldCustomer(1234, "야옹");
        assertEquals(9000, testCustomer.calcPrice(10000));
    }
}