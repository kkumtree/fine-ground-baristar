/*
*   static ~ singleton Pattern
*   와 뭐랄까 getInstance부터 에러가 터져서 자꾸 뭐가 잘 안된다.
*   getInstance는 static 쓰는게 아니고, 처음에 클래스 '인스턴스' 생성할 때 new 연산자를 통해서 해야한다.
 */

package minchoCard;

public class Company {
    private static Company instance = new Company(); //
    private static int cardNumber = 10000;
    private Company() {}
    public static Company getInstance() {
        return instance;
    }
    public static Card
}
