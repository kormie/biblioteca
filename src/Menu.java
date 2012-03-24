import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Menu {

    private String message;
    private List<String> options;
    private Printer printer = new Printer();

    public Menu(String message, List<String> options) {
        this.message = message;
        this.options = options;
    }

    public Menu(String s) {
        this.message = s;
    }

    public void print(){
        printer.output(message + "\n\n\n");
        if (options != null){
            for (int i=0; i < options.size(); i++){
                printer.output((i+1) + ". " + options.get(i));
            }
        }
        printer.output("\n");
    }

    public int selectedOption(String s) {
        return Integer.parseInt(s);
    }

    public String getOptions() {
        String output = "";
        for (int i = 0; i < options.size(); i++)
            output += "\n" + (i+1) + ". " + options.get(i);
        return output;
    }


    // I have no idea how to test a Reader
    public String getUserInput(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String userInput = null;
        try {
            userInput = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInput;
    }
}
