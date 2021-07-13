//forName(String classname)
//해당 클래스, 혹은 인터페이스를 동적 바인딩(동적로딩)하는데 사용한다.

//동적로딩: 실행(runtime) 중에 필요한 데이터 타입을 바인딩하는 것

package classClassStudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String"); //풀네임으로 기재하여야한다.

        Constructor[] cons = c.getConstructors(); //Class 클래스의 멤버 생성자를 보기위한 것
        for (Constructor co : cons) {
            System.out.println(co);
        }

        Method[] m = c.getMethods();
        for (Method me : m) {
            System.out.println(me);
        }


    }
}
