import java.util.ArrayList;
import java.util.Scanner;

public class MainOfficina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Officina officina = new Officina();

        // Lista degli utenti registrati
        ArrayList<User> users = new ArrayList<>();
        // Utenti hardcodati
        users.add(new User("RiccardoFer", "QWERTY"));
        users.add(new User("AndreaFer", "AZERTY"));

        officina.addAuto(new Auto("AB123CD", "Tesla"));
        officina.addAuto(new Auto("GF321BF", "Giulietta"));

        // Richiesta credenziali all'utente
        System.out.println("\nInserisci username");
        String username = sc.nextLine();

        System.out.println("\nInserisci password");
        String password = sc.nextLine();

        User loggedUser = null;

        // Verifica se le credenziali corrispondono ad un utente esistente
        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                loggedUser = user;
                System.out.println("\nLogin effettuato con successo.");
                break;
            }
        }

        // Se non sono valide, permette la registrazione
        if (loggedUser == null) {
            System.out.println("\nCredenziali errate. Vuoi registrarti con queste credenziali? (s/n)");
            String choice = sc.nextLine();
            if (choice.trim().equals("s")) {
                User newUser = new User(username, password);
                users.add(newUser);
                System.out.println("\nRegistrazione effettuata con successo.");
                loggedUser = newUser;
            } else
                System.out.println("\nUscita dal programma. Arrivederci!");
            sc.close();
            return;
        }

        int scelta = 0;

        // Ciclo menu
        while (scelta != 4) {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Aggiungi un'auto");
            System.out.println("2. Stampa le auto in officina");
            System.out.println("3. Rimuovi un'auto");
            System.out.println("4. Esci dal programma");

            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                // Aggiunta auto
                case 1:
                    System.out.println("\nInserisci la targa");
                    String targa = sc.nextLine();
                    System.out.println("\nInserisci il modello");
                    String modello = sc.nextLine();

                    officina.addAuto(new Auto(targa, modello));
                    System.out.println("\nAuto aggiunta con successo!");
                    break;
                // Stampa auto in officina
                case 2:
                    System.out.println("\n---Auto in officina---");
                    officina.printList();
                    break;
                // Rimozione auto da officina
                case 3:
                    System.out.println("\nInserisci la targa");
                    String targaAutoDaRimuovere = sc.nextLine();
                    officina.removeAuto(targaAutoDaRimuovere);
                    break;
                // Uscita dal programma
                case 4:
                    System.out.println("\nEsco dal programma... Arrivederci!");
                    sc.close();
                    break;
                // Caso default in caso si sbagli a inserire opzione
                default:
                    System.out.println("\nScelta non valida. Inserisci un numero da 1 a 4");
                    break;
            }
        }
    }
}
