public class Book {
    private String title;
    private boolean reserved;

    public Book(String title) {
        this.title = title;
        reserved = false;
    }


    public String getTitle() {
        if (this.reserved){
            return "*" + this.title + "*";
        }
        else {
            return this.title;
        }

    }

    public boolean reserved() {
        return this.reserved;
    }

    public void reserve() {
        this.reserved = true;
    }

    public String toString(){
        return this.getTitle();
    }
}
