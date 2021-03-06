/*
*   예제문이 주어진 상태
*   파란 글자가 static 때문인지 튀어나왔다
*   https://stackoverflow.com/questions/21177495/renaming-a-project-in-intellij-idea/45204719
 */

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
