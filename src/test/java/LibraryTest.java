import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library library2;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    Borrower borrower;


    @Before
    public void before() {
        library = new Library(4);
        library2 = new Library(5);
        book1 = new Book("The Magic Mountain", "Thomas Mann", "Modernist novel");
        book2 = new Book("Demons", "Fyodor Dostoevsky", "Philosophical novel");
        book3 = new Book("Moby Dick", "Herman Melville", "Fiction");
        book4 = new Book("Human Acts", "Han Kang", "Fiction");
        book5 = new Book("Flights", "Olga Tokarczuk", "Fiction");
        borrower = new Borrower("Kat");
    }

    @Test
    public void canReportCapacity() {
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookToStockAsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkBookAvailable() {
        assertEquals(false, library.checkInStock(book1));
    }

    @Test
    public void checkBookAvailable__true() {
        library.addBook(book1);
        assertEquals(true, library.checkInStock(book1));
    }

    @Test
    public void testCanLendBook() {
        // arrange
        library.addBook(book1);

        // act
        library.loanBook(book1, borrower);

        // assert
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
        assertEquals(false, library.checkInStock(book1));
    }

    @Test
    public void updatesGenreHashMap__whenBookAdded(){
        //arrange
        library2.addBook(book1);
        library2.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book4);
        library2.addBook(book5);

        assertEquals(3, library2.checkGenreFrequency("Fiction"));
        assertEquals(1, library2.checkGenreFrequency("Philosophical novel"));
        assertEquals(1, library2.checkGenreFrequency("Modernist novel"));
    }
}
