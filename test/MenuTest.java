import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class MenuTest {

    @Test
    public void saysHello(){
        Menu welcomeMenu = new Menu("Welcome to Biblioteca", new String[]{""});
        String message = "Welcome to Biblioteca";
        Assert.assertEquals(message, welcomeMenu.getMessage());
    }

    @Test
    public void returnsUserInputAsInt(){
        Menu welcomeMenu = new Menu("", new String[]{""});
        Assert.assertEquals(1, welcomeMenu.selectedOption("1"));
    }
    
    @Test
    public void setsOptions(){
        Menu welcomeMenu = new Menu("", new String[]{"Option One", "Option Two", "Option Three"});
        Assert.assertEquals("\n1. Option One\n2. Option Two\n3. Option Three", welcomeMenu.getOptions());
    }
    

}
