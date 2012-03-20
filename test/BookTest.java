import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {

    @Test
    public void returnsItsAttributes(){
        Book testBook = new Book("Title");
        Assert.assertEquals("Title", Book.getTitle());
        Assert.assertFalse(Book.reserved());
    }

    @Test
    public void reservesABook(){
        Book testBook = new Book("Title");
        testBook.reserve();
        Assert.assertTrue(Book.reserved());
    }
}
