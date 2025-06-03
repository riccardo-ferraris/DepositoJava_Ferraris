public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    // Metodi getters
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    // Metodi setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Metodo per mostrare dettagli libri
    public void displayBookInfo() {
        System.out.println("Titolo: " + this.title);
        System.out.println("Autore: " + this.author);
        System.out.println("Disponibilità: " + this.isAvailable);
        System.out.println();
    }

    // Costruttore
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}
