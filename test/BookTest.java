import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void returnsItsAttributes(){
        Book testBook = new Book("Title");
        Assert.assertEquals("Title", testBook.getTitle());
        Assert.assertFalse(testBook.reserved());
    }

    @Test
    public void reservesABook(){
        Book testBook = new Book("Title");
        testBook.reserve();
        Assert.assertTrue(testBook.reserved());
    }
}
