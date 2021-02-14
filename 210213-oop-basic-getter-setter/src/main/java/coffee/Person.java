package coffee;

public class Person {
    private String name;
    private int wallet;

    public Person(String name, int wallet) {
        setName(name);
        setWallet(wallet);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void buyStarCafe(StarCafe starCafe, int price) {
        String menuName;
        switch (price) {
            case Menu.STARAMERICANO:
                menuName = "아메리카노";
                break;
            case Menu.STARLATTE:
                menuName = "라떼";
                break;
            default:
                menuName = "";
        }
        if (menuName != "")
            System.out.println(name + "님이 " + starCafe.name + "에서 " + price + "어치 " + menuName + "를 구입했습니다.");
    }

    public void buyBeanCafe(BeanCafe beanCafe, int price) {
        String menuName;
        switch (price) {
            case Menu.BEANAMERICANO:
                menuName = "아메리카노";
                break;
            case Menu.BEANLATTE:
                menuName = "라떼";
                break;
            default:
                menuName = "";
        }
        if (menuName != "")
            System.out.println(name + "님이 " + beanCafe.name + "에서 " + price + "어치 " + menuName + "를 구입했습니다.");
    }
}
