package classClassStudy;

public class PersonNewInstanceTest {
    private String name;
    private int age;

    public PersonNewInstanceTest() {} //이거 생성안했더니 오류가 났다.

    public PersonNewInstanceTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonNewInstanceTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
