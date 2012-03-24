
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void returnsItsAttributes(){
        Book testBook = new Book("Title");
        assertEquals("Title", testBook.getTitle());
        assertFalse(testBook.reserved());
    }

    @Test
    public void reservesABook(){
        Book testBook = new Book("Title");
        testBook.reserve();
        assertTrue(testBook.reserved());
    }

    @Test
    public void reservedBooksLookDifferent(){
        Book testBook = new Book("Title");
        testBook.reserve();
        assertEquals("*Title*", testBook.getTitle());
    }
}
