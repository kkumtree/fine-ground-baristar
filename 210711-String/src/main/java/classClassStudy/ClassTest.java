package classClassStudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("classClassStudy.PersonNewInstanceTest");

        PersonNewInstanceTest person = (PersonNewInstanceTest) c1.newInstance(); //deprecated
        person.setName("Lee");
        System.out.println(person);

        //아래는 마치 "PersonNewInstanceTest kimPerson = new kimPerson("KIM"); 같은 기능을 한다.
        //로컬 메모리에 해당 인스턴스(Person)가 없을 때 사용하는 것이라고 한다. [객체의 타입(자료형)]을 모를때 사용한다.
        Class c2 = person.getClass(); //모든 클래스를 받을 수 있는 getClass를 쓰려면 person같이 인스턴스가 있어야한다.
        PersonNewInstanceTest p = (PersonNewInstanceTest) c2.newInstance();
        System.out.println(p); // 이때 이름이 없다.

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes); //파라미터의 타입을 넣어야한다고함.

        Object[] initargs = {"KIM"};
        PersonNewInstanceTest kimPerson = (PersonNewInstanceTest) cons.newInstance(initargs);
        System.out.println(kimPerson);

        //요거 쓸 때 주의할 점은 해당 클래스에서 생성자 세팅을 제대로 해야된다는 것이다. 오류 뜰때마다 수정했다...
    }
}
