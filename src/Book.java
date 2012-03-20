/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private static String title;
    private static boolean reserved;

    public Book(String title) {
        this.title = title;
        reserved = false;
    }


    public static String getTitle() {
        return title;
    }

    public static boolean reserved() {
        return reserved;
    }

    public void reserve() {
        this.reserved = true;
    }
}
