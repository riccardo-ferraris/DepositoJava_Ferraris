import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Aggiunta libro
    public void addBook(Book book) {
        books.add(book);
    }

    // Mostra libri
    public void displayBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }

    // Presa in prestito di un libro
    public Book borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title.trim())) {
                if (book.getIsAvailable() == true) {
                    System.out.println("Libro " + book.getTitle() + " preso in prestito");
                    book.setIsAvailable(false);
                    return book;
                } else {
                    System.out.println("Libro non disponbile");
                    return null;
                }
            }
        }
        System.out.println("Libro inesistente");
        return null;
    }
}
