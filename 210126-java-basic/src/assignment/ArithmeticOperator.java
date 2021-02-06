/*
**  System.out.println(a + operator + b + " = " + result);
**  위와 같이 입력을 하니, a와 operator의 ascii값, 그리고 b를 합해버리는 이슈가 발생... 이를 어떻게 해결해야 하나.
 */

package assignment;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사칙연산을 할 연산자를 입력하고 Enter를 누르세요 [+, -, *, / 중 하나]");
        char operator = scanner.next().charAt(0);
        System.out.println("정수 A를 입력하고 Enter를 누르세요");
        long a = scanner.nextLong();
        System.out.println("정수 B를 입력하고 Enter를 누르세요");
        long b = scanner.nextLong();

        long result;
        if (operator == '+') {
            result = a + b;
            System.out.println(a + "+" + b + " = " + result);
        }
        else if (operator == '-') {
            result = a - b;
            System.out.println(a + "-" + b + " = " + result);
        }
        else if (operator == '*') {
            result = a * b;
            System.out.println(a + "*" + b + " = " + result);
        }
        else if (b == 0) {
            System.out.println("Error: " + operator + " 연산을 하기위한 제수가 " + b + "입니다.");
        }
        else {
            double dividend = (double) a / (double) b;
            System.out.println(a + "/" + b + " = " + dividend);
        }
    }
}
