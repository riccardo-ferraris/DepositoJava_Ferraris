import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n===== Hotel Menu =====");
            System.out.println("1. Inserisci nuovo ospite");
            System.out.println("2. Effettua prenotazione");
            System.out.println("3. Visualizza tutte le prenotazioni");
            System.out.println("4. Visualizza tutti gli ospiti");
            System.out.println("0. Esci");
            System.out.print("\nScegli un'opzione: ");

            int scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    System.out.print("Cognome: ");
                    String cognome = input.nextLine();
                    System.out.print("Email: ");
                    String email = input.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = input.nextLine();
                    DBManager.inserisciOspite(nome, cognome, email, telefono);
                }
                case 2 -> {
                    System.out.print("ID Ospite: ");
                    int idUtente = input.nextInt();
                    System.out.print("ID Camera: ");
                    int idCamera = input.nextInt();
                    input.nextLine();
                    System.out.print("Data check-in (YYYY-MM-DD): ");
                    String checkin = input.nextLine();
                    System.out.print("Data check-out (YYYY-MM-DD): ");
                    String checkout = input.nextLine();
                    DBManager.effettuaPrenotazione(idUtente, idCamera, checkin, checkout);
                }
                case 3 -> DBManager.visualizzaPrenotazioni();
                case 4 -> DBManager.stampaTuttiGliOspiti();
                case 0 -> {
                    System.out.println("Uscita...");
                    input.close();
                    isRunning = false;
                }
                default -> System.out.println("Opzione non valida.");
            }
        }
    }
}
