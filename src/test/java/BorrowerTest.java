import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Kat");
        book = new Book("The Magic Mountain", "Thomas Mann", "Modernist novel");
        library = new Library(4);
        library.addBook(book);

    }

    @Test
    public void borrowerHasName(){
        assertEquals("Kat", borrower.getName());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book, library);
        assertEquals(1, borrower.borrowedBooksCount());
    }

}
