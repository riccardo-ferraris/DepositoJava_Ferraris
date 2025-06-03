import java.util.ArrayList;

public class UserLibrary {
    // Attributi privati
    private String username;
    private String password;

    // Lista dei libri attualmente presi in prestito da questo utente
    private ArrayList<Book> libriPresiInPrestito = new ArrayList<>();

    // Metodi getters
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public ArrayList<Book> getLibriPresiInPrestito() {
        return this.libriPresiInPrestito;
    }

    // Metodi setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Aggiunta libro preso in prestito
    public void addLibroPresoInPrestito(Book book) {
        libriPresiInPrestito.add(book);
    }

    // Rimozione libro preso in prestito
    public void removeLibroPresoInPrestito(Book book) {
        libriPresiInPrestito.remove(book);
    }

    // Costruttore
    public UserLibrary(String username, String password) {
        this.username = username;
        this.password = password;
        this.libriPresiInPrestito.clear();
    }
}
