package multiInterface;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    //생성자 내에서 멤버변수를 initialize 하는 것이 낫다.
    public Shelf() {
        shelf = new ArrayList<String>(); //굳이 String 명시 안해도 되긴 한다.
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
