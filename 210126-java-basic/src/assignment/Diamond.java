/*
**  개행을 넣기 위한 방법
**  endl 역할을 하는 것이 System.lineSeparator()
*/

package assignment;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("홀수를 입력해주세요");
        int value = scanner.nextInt();

        for (int i = 0; i <= value / 2 + 1; i++) {
            for (int j = 0; j <= (value / 2) - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
        for (int i = 1; i <= value / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < value - 2 * i; j++) {
                System.out.print('*');
            }
            System.out.print(System.lineSeparator());
        }
    }
}
