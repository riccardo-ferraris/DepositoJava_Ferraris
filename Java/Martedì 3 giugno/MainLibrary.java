import java.util.ArrayList;
import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        // Lista utenti registrati
        ArrayList<UserLibrary> utenti = new ArrayList<>();

        // Aggiunga utenti hardcodati
        utenti.add(new UserLibrary("RiccardoFerraris", "12345"));
        utenti.add(new UserLibrary("AndreaFerraris", "67890"));

        // Aggiunta libri hardcodati
        library.addBook(new Book("Il nome della rosa", "Umberto Eco"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Il Signore degli Anelli", "Tolkien"));

        // Login
        System.out.println("Inserisci username:");
        String username = sc.nextLine();
        System.out.println("Inserisci password:");
        String password = sc.nextLine();

        UserLibrary loggedUser = null;
        // Cerca l'utente in base a username e password
        for (UserLibrary user : utenti) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedUser = user;
                break;
            }
        }

        // Se non trova l'utente, offre la possibilità di registrarsi con quelle
        // credenziali
        if (loggedUser == null) {
            System.out.println("Utente non trovato. Vuoi registrarti? (s/n)");
            String sceltaRegistrazione = sc.nextLine();

            if (sceltaRegistrazione.equalsIgnoreCase("s")) {
                System.out.println("Registrazione in corso...");

                // Crea nuovo utente
                UserLibrary nuovoUtente = new UserLibrary(username, password);
                utenti.add(nuovoUtente);
                loggedUser = nuovoUtente;

                System.out.println("Registrazione completata.");
            } else {
                // Se l'utente non vuole registrarsi, esce dal programma
                System.out.println("Operazione annullata. Uscita dal programma.");
                sc.close();
                return;
            }
        }

        System.out.println("Benvenuto, " + loggedUser.getUsername());

        int scelta = 0;

        while (scelta != 5) {
            System.out.println("Scegli un'operazione da eseguire (da 1 a 5)");
            System.out.println("1. Aggiungi libro");
            System.out.println("2. Mostra tutti i libri");
            System.out.println("3. Prendi in prestito un libro");
            System.out.println("4. Mostra i tuoi libri in prestito");
            System.out.println("5. Esci");

            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                // Inserimento nuovo libro
                case 1:
                    System.out.println("Inserisci il titolo del libro");
                    String titolo = sc.nextLine();

                    System.out.println("Inserisci l'autore del libro");
                    String autore = sc.nextLine();

                    Book nuovoLibro = new Book(titolo, autore);

                    library.addBook(nuovoLibro);
                    System.out.println("Libro aggiunto.");

                    break;
                // Mostra libri in biblioteca
                case 2:
                    if (!library.books.isEmpty()) {
                        System.out.println("Lista dei libri in biblioteca");
                        library.displayBooks();
                    } else
                        System.out.println("Non c'è nessun libro in biblioteca.");
                    break;
                // Prestito libro
                case 3:
                    System.out.print("Inserisci il titolo del libro da prendere in prestito: ");
                    String titoloPrestito = sc.nextLine();
                    Book libroPreso = library.borrowBook(titoloPrestito);

                    if (libroPreso != null) {
                        loggedUser.addLibroPresoInPrestito(libroPreso);
                    } else
                        System.out.println("Non è stato trovato nessun libro con titolo " + titoloPrestito);
                    break;
                // Visualizza i libri in prestito dell'utente loggato
                case 4:
                    System.out.println("I tuoi libri in prestito:");
                    for (Book book : loggedUser.getLibriPresiInPrestito()) {
                        book.displayBookInfo();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Uscita dal programma...");
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci un numero da 1 a 5.");
            }
        }

        sc.close();
    }
}
