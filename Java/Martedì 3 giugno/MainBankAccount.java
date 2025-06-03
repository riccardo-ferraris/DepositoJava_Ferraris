import java.util.ArrayList;
import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {
        // Lista utenti registrati
        ArrayList<Utente> listaUtenti = new ArrayList<>();

        // Aggiunta utenti hardcodati
        listaUtenti.add(new Utente("Riccardo Ferraris", new BankAccount("Riccardo Ferraris", 10000)));
        listaUtenti.add(new Utente("Andrea Ferraris", new BankAccount("Andrea Ferraris", 20000)));

        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.print("\nInserisci nome: ");
        String username = scanner.nextLine();

        Utente loggedUser = null;

        // Cerca il nome inserito nella lista utenti
        for (Utente utente : listaUtenti) {
            if (utente.getNome().equals(username)) {
                loggedUser = utente;
                break;
            }
        }

        // Utente trovato, gestisce le operazioni
        if (loggedUser != null) {
            System.out.println("\nAccesso riuscito. Benvenuto, " + loggedUser.getNome());
            gestisciOperazioni(loggedUser, scanner);

        }
        // Utente non trovato, chiede se vuole effettuare la registrazione per poi
        // gestire operazioni
        else {
            System.out.print("\nUtente non trovato. Vuoi registrarti? (s/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("s")) {
                System.out.print("\nScegli un nome per il conto: ");
                String name = scanner.nextLine();

                System.out.print("\nDeposita un importo iniziale: ");
                double initialBalance = scanner.nextDouble();
                scanner.nextLine();

                BankAccount newAccount = new BankAccount(name, initialBalance);
                Utente newUser = new Utente(name, newAccount);
                listaUtenti.add(newUser);

                System.out.println("\nRegistrazione completata. Benvenuto, " + name);
                gestisciOperazioni(newUser, scanner);
            } else {
                System.out.println("\nOperazione annullata.");
            }
        }

        scanner.close();
    }

    // Funzione per gestire le operazioni con un ciclo
    public static void gestisciOperazioni(Utente utente, Scanner scanner) {
        int scelta = 0;

        while (scelta != 4) {
            System.out.println("Che operazione vuoi effettuare? Scegli tra 1 e 4.");
            System.out.println("1. Effettua un deposito");
            System.out.println("2. Effettua un prelievo");
            System.out.println("3. Mostra il tuo saldo");
            System.out.println("4. Esci dal programma");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                // Deposito importo
                case 1:
                    System.out.println("\nScegli l'importo da depositare");
                    double deposito = scanner.nextDouble();
                    scanner.nextLine();
                    utente.getBankAccount().deposit(deposito);
                    break;
                // Prelievo importo
                case 2:
                    System.out.println("\nScegli l'importo da prelevare");
                    double prelievo = scanner.nextDouble();
                    scanner.nextLine();
                    utente.getBankAccount().withdraw(prelievo);
                    break;
                // Mostra saldo
                case 3:
                    utente.getBankAccount().displayBalance();
                    break;
                // Uscita dal programma
                case 4:
                    System.out.println("\nIn uscita...");
                    scanner.close();
                    break;
                // Valore invalido
                default:
                    System.out.println("\nInserisci un valore valido");
                    break;
            }
        }
    }
}
