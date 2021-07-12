package Student;

import java.awt.*;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");
        Student std3 = std1; //주소값만 복사한 것

        System.out.println(std1 == std2); // 주소값 비교이기 때문에 False이다
        System.out.println(std1.equals(std2)); //오버라이딩을 통해 보정할 수 있다 (논리적으로 같다)

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        /*
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer i = 100; //Integer는 new할 필요 없음
        System.out.println(i.hashCode()); //
        */

        System.out.println(System.identityHashCode(std1)); //실제 해시코드를 출력하는 static 함수
        System.out.println(System.identityHashCode(std2));

        std1.setStudentName("GIMP");
        Student copyStudent = (Student)std1.clone(); //리턴값이 Object이기 때문에 형변환을 해줘야한다.
        System.out.println(copyStudent); //그냥하면 오류가 나고 Student 클래스에서 cloneable로 허용해줘야한다.
    }
}
