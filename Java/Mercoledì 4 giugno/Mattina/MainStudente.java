import java.util.ArrayList;
import java.util.Scanner;

public class MainStudente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista dinamica per memorizzare gli studenti
        ArrayList<Studente> studenti = new ArrayList<>();

        // Creazione di due studenti hardcodati
        Studente studente1 = new Studente("Riccardo", 4);
        Studente studente2 = new Studente("Andrea", 2);

        // Aggiunta degli studenti alla lista
        studenti.add(studente1);
        studenti.add(studente2);

        // Creazione del professore
        Professore prof = new Professore("Mirko");

        // Visualizzazione iniziale degli studenti
        prof.visualizzaStudenti(studenti);

        // Variabili per la selezione dello studente da modificare
        boolean isFound = false;
        String nomeDaModificare = "";
        Studente studenteSelezionato = null;

        // Ciclo per chiedere il nome finché non viene trovato uno studente
        // corrispondente
        do {
            System.out.println("\nIl professore vuole modificare il voto di uno studente. Inserisci il nome:");
            nomeDaModificare = sc.nextLine();

            // Ricerca dello studente nella lista
            for (Studente s : studenti) {
                if (s.getNome().equalsIgnoreCase(nomeDaModificare)) {
                    isFound = true;
                    studenteSelezionato = s;
                    break;
                }
            }

            // Messaggio di errore se lo studente non è stato trovato
            if (!isFound) {
                System.out.println("Studente non trovato. Riprova.");
            }

        } while (!isFound);

        int nuovoVoto;

        // Ciclo per inserire un voto valido (tra 0 e 10)
        do {
            System.out.println("\nInserisci il nuovo voto:");
            nuovoVoto = sc.nextInt();
            sc.nextLine();

            if (nuovoVoto < 0 || nuovoVoto > 10)
                System.out.println("\nVoto non valido, reinseriscilo (0-10)");
        } while (nuovoVoto < 0 || nuovoVoto > 10);

        // Assegnazione del nuovo voto allo studente selezionato
        studenteSelezionato.setVoto(nuovoVoto);

        // Visualizzazione aggiornata della lista studenti
        prof.visualizzaStudenti(studenti);

        // Ricerca di uno studente per nome
        System.out.println("\nIl prof vuole ricercare uno studente per nome: ");
        String nome = sc.nextLine();
        prof.cercaPerNome(nome, studenti);

        sc.close();
    }
}