package inheritance;

public class VIPCustomer extends Customer{
/* inheritance
 private int customerID;
 private String customerName;
 private String customerGrade;
 int bonusPoint;
 double bonusRatio;
*/
    double salesRatio;
    private int agentID;

    public VIPCustomer() {
        super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }
}
