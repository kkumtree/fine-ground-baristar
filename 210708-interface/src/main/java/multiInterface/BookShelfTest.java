package multiInterface;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("포터블루1");
        bookQueue.enQueue("포터블루2");
        bookQueue.enQueue("포터블루3");
        bookQueue.enQueue("포터블루4");
        bookQueue.enQueue("포터블루5");

        System.out.println(bookQueue.getSize());
        while (bookQueue.getSize() != 0) {
            System.out.println(bookQueue.deQueue());
        }
    }
}
