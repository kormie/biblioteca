import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args){

        Library library = createLibrary();

        while (true){

            Printer printer = new Printer();

            int selectedOption = mainMenu();

            switch (selectedOption){
                case 1: printer.output(library);
                    break;
                case 2: reservations(library);
                    break;
                case 3: checkLibraryNumber();
                    break;
                default: printer.output("\n\n\nSelect a valid option!!\n\n\n");
                    break;
            }

        }
    }

    private static Library createLibrary() {
        Book book1 = new Book("The Lion, the Witch and the Wardrobe");
        Book book2 = new Book("She");
        Book book3 = new Book("The Da Vinci Code");
        Book book4 = new Book("Think and Grow Rich");
        Book book5 = new Book("The Catcher in the Rye");
        Book book6 = new Book("The Alchemist");
        Book book7 = new Book("Steps to Christ");
        Book book8 = new Book("Lolita");
        Book book9 = new Book("Heidi's Years of Wandering and Learning");
        Book book10 = new Book("The Common Sense Book of Baby and Child Care");
        Book book11 = new Book("Anne of Green Gables");
        Book book12 = new Book("Black Beauty");
        Book book13 = new Book("The Name of the Rose");
        Book book14 = new Book("The Eagle Has Landed");
        Book book15 = new Book("Watership Down");
        Book[] books = new Book[] {book1, book2, book3,  book4,  book5,  book6,  book7,  book8,  book9,  book10, book11, book12, book13, book14, book15};
        ArrayList<Book> libraryBooks = new ArrayList<Book>();
        Collections.addAll(libraryBooks, books);
        return new Library(libraryBooks);
    }

    private static int mainMenu() {
        List<String> welcomeOptions;
        welcomeOptions = new ArrayList<String>
                (Arrays.asList("View all books", "Reserve a Book", "Check my Library Number"));
        Menu welcomeMenu = new Menu("Welcome to Biblioteca", welcomeOptions);
        welcomeMenu.print();
        return Integer.parseInt(welcomeMenu.getUserInput());
    }

    private static void reservations(Library library){
        System.out.println("\n\n\n");
        Menu reservationMenu = new Menu("Which book would you like to reserve?\n");
        reservationMenu.print();
        String selection = reservationMenu.getUserInput();
        Boolean matched = reserveBook(library, selection);
        if(!matched){ System.out.println("\n\n\nSorry we don't have that book yet.\n\n\n"); }
        }

    private static Boolean reserveBook(Library library, String selection) {
        Boolean matched = false;
        for (Book book : library.books()){
            if(selection.equals(book.getTitle())){
                matched = true;
                if(!book.reserved()){
                    book.reserve();
                    System.out.println("\n\n\nThank You! Enjoy the book.\n\n\n");
                }
            }

        }
        return matched;
    }

    private static void checkLibraryNumber(){
        System.out.println("\n\n\nPlease talk to Librarian. Thank you.\n\n\n");
    }
}
