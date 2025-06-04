import java.util.Scanner;

public class MainChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ristorante ristorante = new Ristorante();

        System.out.println("Benvenuto nel sistema del ristorante!");
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci la tua email: ");
        String email = scanner.nextLine();

        int scelta = 0;
        while (scelta != 1 && scelta != 2) {
            System.out.print("Scegli il tuo ruolo (1 = Chef, 2 = Critico): ");
            if (scanner.hasNextInt()) {
                scelta = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Scelta non valida, riprova.");
            }
        }

        Utente utente;
        if (scelta == 1) {
            utente = new Chef(nome, email);
            System.out.println("Hai scelto di diventare uno Chef!");
        } else {
            utente = new Critico(nome, email);
            System.out.println("Hai scelto di diventare un Critico!");
        }

        boolean continua = true;
        while (continua) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Aggiungi un piatto (Chef)");
            System.out.println("2. Lascia una recensione (Critico)");
            System.out.println("3. Visualizza menu del ristorante");
            System.out.println("4. Visualizza recensioni");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");

            int opzione;
            if (scanner.hasNextInt()) {
                opzione = scanner.nextInt();
                scanner.nextLine();

                switch (opzione) {
                    case 1:
                        if (utente instanceof Chef) {
                            System.out.print("Inserisci il nome del piatto: ");
                            String piatto = scanner.nextLine();
                            ((Chef) utente).creaPiatto(ristorante, piatto);
                        } else {
                            System.out.println("Solo gli Chef possono aggiungere piatti!");
                        }
                        break;
                    case 2:
                        if (utente instanceof Critico) {
                            System.out.print("Inserisci la tua recensione: ");
                            String recensione = scanner.nextLine();
                            ((Critico) utente).lasciaRecensione(ristorante, recensione);
                        } else {
                            System.out.println("Solo i Critici possono lasciare recensioni!");
                        }
                        break;
                    case 3:
                        ristorante.stampaMenu();
                        break;
                    case 4:
                        ristorante.stampaValutazioni();
                        break;
                    case 5:
                        continua = false;
                        System.out.println("Arrivederci e grazie!");
                        break;
                    default:
                        System.out.println("Opzione non valida.");
                }
            } else {
                scanner.nextLine();
                System.out.println("Inserisci un numero valido.");
            }
        }

        scanner.close();
    }
}
