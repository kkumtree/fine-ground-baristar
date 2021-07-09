package elementsDemo;

public class CalcTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        // calcDemo.Calc calc = new calcDemo.CompleteCalc(); 인터페이스 타입일 때는 showInfo 호출불가
        Calculator calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        //default 메서드
        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr)); //static이기 때문에 인터페이스에서 바로 써도 됨.

    }
}
