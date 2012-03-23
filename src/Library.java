import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library(ArrayList<Book> bookArray) {
        this.books = bookArray;
    }

    public ArrayList<Book> books() {

        return this.books;
    }
}
