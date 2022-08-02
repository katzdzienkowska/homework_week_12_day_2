import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> libraryStock;

    public Library(int capacity){
        this.capacity = capacity;
        this.libraryStock = new ArrayList<>();
    }

    public int bookCount(){
        return libraryStock.size();
    }

    public void addBook(Book book){
        if (bookCount() < capacity) {
            libraryStock.add(book);
        }
    }

    public void removeBook(Book book){
        int index = libraryStock.indexOf(book);
        libraryStock.remove(index);
    }
}
