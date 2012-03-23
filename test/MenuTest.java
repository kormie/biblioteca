import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MenuTest {

//    @Test
//    public void saysHello(){
//        List<String> string = Arrays.asList("hello");
//        Menu welcomeMenu = new Menu("Welcome to Biblioteca", string);
//        String message = "Welcome to Biblioteca";
//        Assert.assertEquals(message, welcomeMenu.print(););
//    }

    @Test
    public void returnsUserInputAsInt(){
        Menu welcomeMenu = new Menu("", Arrays.asList(""));
        Assert.assertEquals(1, welcomeMenu.selectedOption("1"));
    }
    
    @Test
    public void setsOptions(){
        Menu welcomeMenu = new Menu("", Arrays.asList("Option One", "Option Two", "Option Three"));
        Assert.assertEquals("\n1. Option One\n2. Option Two\n3. Option Three", welcomeMenu.getOptions());
    }
    

}
