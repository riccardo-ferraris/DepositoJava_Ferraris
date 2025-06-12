import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== GESTIONE ORDINI =====");
            System.out.println("1. Nuovo ordine");
            System.out.println("2. Storico ordini cliente");
            System.out.println("3. Aggiorna stato ordine");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            int scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1 -> {
                    System.out.print("ID cliente: ");
                    int idCliente = input.nextInt();
                    input.nextLine();

                    Map<Integer, Integer> prodotti = new HashMap<>();
                    while (true) {
                        System.out.print("ID prodotto (0 per terminare): ");
                        int idProdotto = input.nextInt();
                        if (idProdotto == 0)
                            break;

                        System.out.print("Quantità: ");
                        int quantita = input.nextInt();
                        prodotti.put(idProdotto, quantita);
                    }

                    DBManager.inserisciOrdine(idCliente, prodotti);
                }
                case 2 -> {
                    System.out.print("ID cliente: ");
                    int idCliente = input.nextInt();
                    DBManager.visualizzaStoricoCliente(idCliente);
                }
                case 3 -> {
                    System.out.print("ID ordine: ");
                    int idOrdine = input.nextInt();
                    input.nextLine();
                    System.out.print("Nuovo stato (In lavorazione, Spedito, Consegnato, Annullato): ");
                    String stato = input.nextLine();
                    DBManager.aggiornaStatoOrdine(idOrdine, stato);
                }
                case 0 -> {
                    System.out.println("Uscita...");
                    input.close();
                    return;
                }
                default -> System.out.println("Scelta non valida.");
            }
        }
    }
}
