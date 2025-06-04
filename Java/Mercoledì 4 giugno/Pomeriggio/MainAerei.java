import java.util.Scanner;

public class MainAerei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --------------------- Esercizio Base ---------------------
        // Istanza aerei hardcodati
        Aereo aereo1 = new Aereo("Boeing 737 MAX 8", 189, "BX737MAX8-ITA123");
        Aereo aereo2 = new Aereo("Airbus A320neo", 180, "AB320NEO-FR456");

        // Istanza piloti hardcodati
        Pilota pilota1 = new Pilota("Marco Bianchi", "IT-PIL-001234", 8500);
        Pilota pilota2 = new Pilota("Laura Rossi", "IT-PIL-007890", 6700);

        // Istanza compagnia aerea
        CompagniaAerea compagniaAerea = new CompagniaAerea();

        // Aggiunta aerei a compagnia aerea
        compagniaAerea.addAereo(aereo1);
        compagniaAerea.addAereo(aereo2);

        // Aggiunta piloti a compagnia aerea
        compagniaAerea.addPilota(pilota1);
        compagniaAerea.addPilota(pilota2);

        // --------------------- Esercizio extra ---------------------

        // Scelta menu, si ferma con scelta == 5
        int scelta = 0;

        while (scelta != 6) {
            System.out.println("\nSeleziona l'operazione che vuoi effettuare");
            System.out.println("1. Ricerca per modello aereo");
            System.out.println("2. Ricerca per nome pilota");
            System.out.println("3. Ricerca per codice aereo");
            System.out.println("4. Ricerca per numero brevetto pilota");
            System.out.println("5. Stampa tutti i piloti e tutti gli aerei della compagnia aerea");
            System.out.println("6. Esci dal programma");

            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {
                // Caso di filtraggio per modello aereo
                case 1:
                    System.out.println("\nInserisci il modello dell'aereo da ricercare:");
                    String modello = sc.nextLine();
                    compagniaAerea.ricercaModelloAereo(modello);
                    break;
                // Caso di filtraggio per nome pilota
                case 2:
                    System.out.println("\nInserisci il nome del pilota da ricercare:");
                    String nome = sc.nextLine();
                    compagniaAerea.ricercaNomePilota(nome);
                    break;
                // Caso di filtraggio per codice aereo
                case 3:
                    System.out.println("\nInserisci il codice dell'aereo da ricercare:");
                    String codice = sc.nextLine();
                    compagniaAerea.ricercaCodiceAereo(codice);
                    break;
                // Caso di filtraggio per numero di brevetto pilota
                case 4:
                    System.out.println("\nInserisci il numero di brevetto del pilota da ricercare:");
                    String numeroBrevetto = sc.nextLine();
                    compagniaAerea.ricercaNumeroBrevettoPilota(numeroBrevetto);
                    break;
                // Caso di stampa info della compagnia aerea
                case 5:
                    compagniaAerea.printPilotiEAerei();
                    break;
                // Uscita dal programma
                case 6:
                    System.out.println("\nUscita dal programma");
                    sc.close();
                    break;
                default:
                    System.out.println("\nInserisci un valore valido (1-6)");
                    break;
            }
        }
    }
}