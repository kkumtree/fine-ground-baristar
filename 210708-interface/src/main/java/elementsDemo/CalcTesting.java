package elementsDemo;

public class CalcTesting {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        // calcDemo.Calc calc = new calcDemo.CompleteCalc(); 인터페이스 타입일 때는 showInfo 호출불가
        Calculator calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        // 오류가 나버림; 짜증남...
        // calc.description();
    }
}
