package minchoCard;

public class CardCompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance(); // 싱글톤 패턴

        Card myCard = company.createCard();
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNumber()); // 10001 출력
        System.out.println(yourCard.getCardNumber());   // 10002 출력
    }
}
