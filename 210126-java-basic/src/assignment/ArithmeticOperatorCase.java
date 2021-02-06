package assignment;

import java.util.Scanner;

public class ArithmeticOperatorCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사칙연산을 할 연산자를 입력하고 Enter를 누르세요 [+, -, *, / 중 하나]");
        char operator = scanner.next().charAt(0);
        System.out.println("정수 A를 입력하고 Enter를 누르세요");
        long a = scanner.nextLong();
        System.out.println("정수 B를 입력하고 Enter를 누르세요");
        long b = scanner.nextLong();

        long result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println(a + "+" + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + "-" + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + "*" + b + " = " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: " + operator + " 연산을 하기위한 제수가 " + b + "입니다.");
                    break;
                }
                result = a / b;
                System.out.println(a + "/" + b + " = " + result);
                break;
        }
    }
}
