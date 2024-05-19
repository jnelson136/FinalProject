package wctc.edu;

public class borrowBook implements Borrowing {

    @Override
    public void borrowItem(Member member, Book book) {
        if (book.isAvailable()) {
            book.setBorrowed(true);
            member.addBorrowedBook(book);
            System.out.println("Thank you for borrowing " + book.getTitle());
        } else {
            System.out.println("Sorry, that book is unavailable to borrow!");
        }
    }
}
