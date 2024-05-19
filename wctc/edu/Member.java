package wctc.edu;

import java.util.ArrayList;
import java.util.List;

public class Member implements Observer {
    private String name;
    private List<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }
    @Override
    public void update(String message) {
        System.out.println("New Message: " + message);
    }
}
