package polymophism;

public class VIPCustomer extends Customer {
/* inheritance
 private int customerID;
 private String customerName;
 private String customerGrade;
 int bonusPoint;
 double bonusRatio;
*/
    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); //상위클래서의 기본 생성자가 없는 경우 명시해야함
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (price - (int)(price * salesRatio));
    }
}
