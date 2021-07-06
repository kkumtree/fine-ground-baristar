package abstractStudy;

// 오버라이딩을 하지 않은 메서드가 있으므로, abstract 사용
public abstract class NoteBook extends Computer{

    @Override
    void display() {
        System.out.println("abstractStudy.NoteBook Display.");
    }

}
