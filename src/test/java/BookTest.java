import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Magic Mountain", "Thomas Mann", "Modernist novel");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Magic Mountain", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Thomas Mann", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Modernist novel", book.getGenre());
    }
}
