package templeteStudy;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    // 바뀌면 안되는 메서드는 final로 고정한다.
    final public void run () {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
