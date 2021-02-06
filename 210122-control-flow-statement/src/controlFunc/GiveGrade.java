/*
**  여기서는 scanner에 대해 처음 나왔기 때문에, 관련하여 코드를 작성, 저장하게 되었습니다.
 */

package controlFunc;

import java.util.Scanner;

public class GiveGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();

        if (point <= 59) {
            System.out.println("F");
        }

        int b = -2147483648;
        System.out.println("(b>>>1) = " + Integer.toBinaryString(b>>>1));
        System.out.println("(b>>>30) = " + Integer.toBinaryString(b>>>30));

    }
}
