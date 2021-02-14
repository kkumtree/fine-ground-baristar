package coffee;

public class CoffeeTest {
    public static void main(String[] args) {
        StarCafe starCafe = new StarCafe();
        BeanCafe beanCafe = new BeanCafe();
        Person kim = new Person("김졸려", 10000);
        Person lee = new Person("이피곤", 6000);
        kim.buyStarCafe(starCafe, Menu.STARAMERICANO);
        lee.buyBeanCafe(beanCafe, Menu.BEANLATTE);
    }
}
