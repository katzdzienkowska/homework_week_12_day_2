import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;

    @Before
    public void before() {
        library = new Library(4);
        book1 = new Book("The Magic Mountain", "Thomas Mann", "Modernist novel");
        book2 = new Book("Demons", "Fyodor Dostoevsky", "Philosophical novel");
        book3 = new Book("Moby Dick", "Herman Melville", "Fiction");
        book4 = new Book("Human Acts", "Han Kang", "Fiction");
        book5 = new Book("Flights", "Olga Tokarczuk", "Fiction");
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
}
