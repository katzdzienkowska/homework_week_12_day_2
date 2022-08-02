import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowersCollection;

    public Borrower(String name){
        this.name = name;
        this.borrowersCollection = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int borrowedBooksCount(){
        return borrowersCollection.size();
    }

    public void borrowBook(Book book, Library library){
        library.removeBook(book);
        borrowersCollection.add(book);
    }
}
