/**
 * Created by IntelliJ IDEA.
 * User: Thoughtworks
 * Date: 3/20/12
 * Time: 3:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args){
        while (true){
            String[] welcomeOptions= new String[]{"View all books", ""};
            Menu welcomeMenu = new Menu("Welcome to Biblioteca", welcomeOptions);
            System.out.println(welcomeMenu.getMessage());
            System.out.println(welcomeMenu.getOptions());
            int selectedOption = Integer.parseInt(welcomeMenu.getUserInput());
        }
    }
}
