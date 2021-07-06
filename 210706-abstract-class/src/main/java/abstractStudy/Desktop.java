package abstractStudy;

public class Desktop extends Computer{
    @Override
    void display() {
        System.out.println("abstractStudy.Desktop Display.");
    }

    @Override
    void typing() {
        System.out.println("abstractStudy.Desktop Typing.");
    }

    @Override
    void turnOn() {
        System.out.println("abstractStudy.Desktop TurnOn.");
    }
}
