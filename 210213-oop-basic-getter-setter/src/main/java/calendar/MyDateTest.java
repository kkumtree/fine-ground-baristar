/*
*   자꾸 테스트 문 구현할 때 메인문 생성해야한다는 걸 까먹는 중
 */

package calendar;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(31, 3, 2021);
        date1.printIsValid();
        MyDate date2 = new MyDate(29, 2, 2021);
        date2.printIsValid();
    }
}
