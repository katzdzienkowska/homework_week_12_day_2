import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Kat");
        book = new Book("The Magic Mountain", "Thomas Mann", "Modernist novel");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Kat", borrower.getName());
    }

    @Test
    public void testCountBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void testCanAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

}
