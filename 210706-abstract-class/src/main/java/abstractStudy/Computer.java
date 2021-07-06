package abstractStudy;

public abstract class Computer {

    abstract void display();
    abstract void typing();

    void turnOn() {
        System.out.println("전원이 켜졌습니다.");
    }

    void turnOff() {
        System.out.println("전원이 꺼졌습니다.");
    }
}
