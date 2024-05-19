package wctc.edu;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryBooks implements Subject {
    private static LibraryBooks instance;
    private List<Book> books;
    private List<Observer> observers;

    private LibraryBooks() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static LibraryBooks getInstance() {
        if (instance == null) {
            instance = new LibraryBooks();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("Added: " + book.getTitle());
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
