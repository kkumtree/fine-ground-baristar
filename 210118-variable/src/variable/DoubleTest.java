package variable;

/*
** 단축키 참조: http://jaeunsw.blogspot.com/2017/09/java-intellij.html
 */

public class DoubleTest {
    public static void main(String[] args) { //단축키 psvm
        double dNum = 3.14;

        float fNum = 3.14F;

        System.out.println(dNum);
        System.out.println(fNum);

        double dN = 1;
        for (int i = 0; i < 10000; i++) {
            dN = dN + 0.1;
        }
        System.out.println(dN); //오차 발생! But 감수해야한다고 한다.
    }
}
