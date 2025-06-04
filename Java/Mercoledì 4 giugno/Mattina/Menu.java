import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PiattoSpeciale piattoSpeciale = new PiattoSpeciale();

        int scelta1 = 0;
        int scelta2 = 0;

        while (scelta1 < 1 || scelta1 > 2) {
            System.out.println("Scegli tra questi tipi di pane:");
            System.out.println("1. Normale: 1.00 euro");
            System.out.println("2. Al sesamo: 1.30 euro");

            scelta1 = scanner.nextInt();
            scanner.nextLine();

            switch (scelta1) {
                case 1:
                    piattoSpeciale.setPane("Normale", 1);
                    break;
                case 2:
                    piattoSpeciale.setPane("Al sesamo", 1.30);
                    break;
                default:
                    break;
            }
        }

        while (scelta2 != 5) {
            System.out.println("Scegli tra questi ingredienti:");
            System.out.println("1. Insalata: 0.50 euro");
            System.out.println("2. Pomodoro: 0.70 euro");
            System.out.println("3. Formaggio: 1.00 euro");
            System.out.println("4. Bacon: 1.50 euro");
            System.out.println("5. Invia ordine");

            scelta2 = scanner.nextInt();
            scanner.nextLine();

            switch (scelta2) {
                case 1:
                    piattoSpeciale.ingredienti.put("Insalata", 0.50);
                    break;
                case 2:
                    piattoSpeciale.ingredienti.put("Pomodoro", 0.70);
                    break;
                case 3:
                    piattoSpeciale.ingredienti.put("Formaggio", 1.00);
                    break;
                case 4:
                    piattoSpeciale.ingredienti.put("Bacon", 1.50);
                    break;
                case 5:
                    System.out.println("Totale: " + piattoSpeciale.calcTot());
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }
}
