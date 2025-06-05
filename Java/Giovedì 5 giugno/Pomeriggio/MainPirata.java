import java.util.ArrayList;
import java.util.Scanner;

public class MainPirata {
    public static void main(String[] args) {
        // ------------ Esercizio base ------------
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.saluta();
        persona2.saluta();

        Pirata pirata = new Pirata();

        pirata.saluta();

        // ------------ Esercizio extra ------------
        Scanner sc = new Scanner(System.in);

        ArrayList<Utente> utenti = new ArrayList<>();

        utenti.add(new Utente("RiccardoFer", "1234"));
        utenti.add(new Utente("AndreaFerr", "4321"));

        System.out.println("Inserisci username:");
        String username = sc.nextLine();
        System.out.println("Inserisci password:");
        String password = sc.nextLine();

        Utente utenteLoggato = null;

        for (Utente utente : utenti) {
            if (utente.getUsername().equalsIgnoreCase(username) && utente.checkPassword(password)) {
                utenteLoggato = utente;
            }
        }

        if (utenteLoggato == null) {
            System.out.println("Utente non trovato. Vuoi registrarti? (s/n)");
            String scelta = sc.nextLine();

            if (scelta.equalsIgnoreCase("s")) {
                Utente nuovoUtente = new Utente(username, password);
                utenti.add(nuovoUtente);
                utenteLoggato = nuovoUtente;
                System.out.println("Utente registrato");
            } else {
                System.out.println("Uscita dal programma. Arrivederci!");
                return;
            }
        }

    }
}
