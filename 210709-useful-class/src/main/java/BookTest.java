class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return (title + ", " + author);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("돈으로 살 수 없는 것들", "마이클 샌델");

        System.out.println(book); //클래스@가상메모리주소 [아래처럼 나오게 하려면, toString()을 오버라이딩 하면 된다]

        String str = new String("TEST");
        System.out.println(str); //여기서 값이 뜨는 이유는 String/Integer 클래스는 이미 toString()로 재정의되어있기 때문임
    }
}
