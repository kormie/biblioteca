
public class Printer {

    public void output(Library bibliotecaLibrary) {
        System.out.println("\n\n\nHere are the books we have:\n");
        for (int i = 0; i < bibliotecaLibrary.books().size(); i++){
            System.out.println((i+1) + ". " + bibliotecaLibrary.books().get(i));
        }
        System.out.println("\n");
    }

    public void output(String message) {
        System.out.println(message);
    }
}
