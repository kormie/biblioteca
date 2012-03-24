import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MenuTest {

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


    // because this returns a void, I am having trouble testing it
    // I think in a later refactoring I should pull something out of
    // here that I can test but I'm not exactly sure what.

//    @Test
//    public void printsCorrectly(){
//        Menu testMenu1 = new Menu("hello");
//    }
    

}
