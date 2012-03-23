import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void returnsAnArrayOfBooks(){
        Book testBook1 = new Book("Test Book 1");
        Book testBook2 = new Book("Test Book 2");
        Book[] bookArray = new Book[] {testBook1, testBook2};
        ArrayList<Book> libraryBooks = new ArrayList<Book>();
        Collections.addAll(libraryBooks, bookArray);
        Library testLibrary = new Library(libraryBooks);
        assertEquals(libraryBooks, testLibrary.books());
    }
}
