package witharraylist;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); //상위클래서의 기본 생성자가 없는 경우 명시해야함
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (price - (int)(price * salesRatio));
    }
    
    public String showCustomerInfo() {
        return (super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다");
    }

    public int getAgentID() {
        return agentID;
    }
}
