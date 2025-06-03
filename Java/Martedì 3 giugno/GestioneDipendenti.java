import java.util.ArrayList;
import java.util.Scanner;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList con dipendenti
        ArrayList<Dipendente> dipendenti = new ArrayList<>();
        // Aggiunta dipendenti predefiniti
        dipendenti.add(new Dipendente("Riccardo", 30000, "Nettezza urbana"));
        dipendenti.add(new Dipendente("Nicola", 26750, "IT"));
        dipendenti.add(new Dipendente("Franco", 43000, "Asciugatura Scogli"));
        dipendenti.add(new Dipendente("Giorgio", 34000, "Smacchiatura Leopardi"));

        // Variabile per scelta nel menu
        int scelta = 0;

        // Loop di scelta, si interromperà a scelta == 5
        while (scelta != 5) {
            System.out.println("Seleziona scelta (1-5)");
            System.out.println("1. Aggiungi dipendente");
            System.out.println("2. Stampa tutti i dipendenti");
            System.out.println("3. Aggiorna dipendente");
            System.out.println("4. Elimina dipendente");
            System.out.println("5. Esci dal programma");

            scelta = sc.nextInt();
            sc.nextLine(); // Consuma il newline rimasto nel buffer

            // Switch per la scelta dell'operazione da effettuare (1-5)
            switch (scelta) {
                // Operazione di aggiunta dipendente
                case 1:
                    System.out.println("Inserisci nome dipendente");
                    String nome = sc.nextLine();

                    System.out.println("Inserisci stipendio dipendente");
                    int stipendio = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Inserisci dipartimento");
                    String dipartimento = sc.nextLine();

                    dipendenti.add(new Dipendente(nome, stipendio, dipartimento));

                    break;
                // Operazione di stampa dipendenti
                case 2:
                    if (dipendenti.isEmpty())
                        System.out.println("Nessun dipendente in lista.");
                    else {
                        for (Dipendente dipendente : dipendenti) {
                            dipendente.stampaDettagli();
                        }
                    }
                    break;
                // Operazione di aggiornamento dipendente
                case 3:
                    System.out.println(
                            "Inserisci l'indice del dipendente da aggiornare (da 0 a " + (dipendenti.size() - 1)
                                    + ").");
                    int idxUpd = sc.nextInt();
                    sc.nextLine();

                    if (idxUpd >= 0 && idxUpd < dipendenti.size()) {
                        Dipendente d = dipendenti.get(idxUpd);

                        System.out.println("Inserisci nuovo nome (lascia vuoto per non modificare):");
                        String nuovoNome = sc.nextLine();
                        if (!nuovoNome.trim().isEmpty())
                            d.setNome(nuovoNome);

                        System.out.println("Inserisci nuovo stipendio (-1 per non modificare):");
                        int nuovoStipendio = sc.nextInt();
                        sc.nextLine();
                        if (nuovoStipendio >= 0)
                            d.setStipendio(nuovoStipendio);

                        System.out.println("Inserisci nuovo dipartimento (lascia vuoto per non modificare):");
                        String nuovoDipartimento = sc.nextLine();
                        if (!nuovoDipartimento.trim().isEmpty())
                            d.setDipartimento(nuovoDipartimento);

                        System.out.println("Dipendente " + idxUpd + " aggiornato.");
                    } else
                        System.out.println("Indice non valido.");

                    break;
                // Operazione di eliminazione dipendente
                case 4:
                    System.out.println(
                            "Inserisci l'indice del dipendente da eliminare (da 0 a " + (dipendenti.size() - 1) + ")");
                    int idxDel = sc.nextInt();
                    sc.nextLine();

                    if (idxDel >= 0 && idxDel < dipendenti.size()) {
                        dipendenti.remove(idxDel);
                        System.out.println("Dipendente rimosso");
                    } else {
                        System.out.println("Indice non valido");
                    }
                    break;
                // Operazione di uscita dal programma
                case 5:
                    System.out.println("Uscita dal programma.");
                    sc.close();
                    break;
                default:
                    System.out.println("Scelta non valida. Inserire un numero tra 1 e 5");
                    break;
            }
        }
    }
}