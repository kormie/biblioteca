import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    private String message;
    private String[] options;

    public Menu(String message, String[] options) {
        this.message = message;
        this.options = options;
    }

    public String getMessage() {
        return message;
    }

    public int selectedOption(String s) {
        return Integer.parseInt(s);
    }

    public String getOptions() {
        String output = "";
        for (int i = 0; i < options.length; i++)
            output += "\n" + (i+1) + ". " + options[i];
        return output;
    }

    public String getUserInput(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String userInput = null;
        try {
            userInput = in.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return userInput;
    }
}
