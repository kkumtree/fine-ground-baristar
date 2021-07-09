package elementsDemo;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //default 메서드
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myPrivateMethod();
    }

    //정적 메서드, 인스턴스 생성과 관련없이 생성
    static int total(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        myPrivateStaticMethod();
        return (total);
    }

    //private 메서드 (1 - 기본) : 인터페이스 내에서만 사용하기 위한 메서드
    private void myPrivateMethod() {
        System.out.println("My Private Method");
    }

    //private 메서드 (2 - 정적)
    private static void myPrivateStaticMethod() {
        System.out.println("My Private Static Method");
    }
}
