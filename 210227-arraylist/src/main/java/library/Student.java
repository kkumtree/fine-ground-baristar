package library;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Book> bookArrayList;
    int index;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        bookArrayList = new ArrayList<Book>();
    }

    public void addBook(String bookName, String author){
        Book book = new Book();

        book.setBookName(bookName);
        book.setAuthor(author);
        bookArrayList.add(book);
    }

    public void showStudentInfo(){
        System.out.print(studentName + " 학생이 읽은 책은 : ");

        for(Book book : bookArrayList){
            System.out.print(book.getBookName() + " ");
        }

        System.out.println("입니다");
    }
}
