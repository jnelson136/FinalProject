package wctc.edu;

public class ConcreteBookFactory extends BookFactory {
    @Override
    public Book createBook(String title) {
        return new Book(title);
    }

}
