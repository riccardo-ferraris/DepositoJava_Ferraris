import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        // Istanza di Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa:");
        // Legge una stringa dall'input dell'utente con nextLine()
        String stringa = scanner.nextLine();

        System.out.println("Inserisci un booleano:");
        // Legge un booleano dall'input dell'utente con nextBoolean()
        boolean booleano = scanner.nextBoolean();

        System.out.println("Inserisci un byte:");
        // Legge un byte dall'input dell'utente con nextByte()
        byte byteVal = scanner.nextByte();

        System.out.println("Inserisci un double:");
        // Legge un double dall'input dell'utente con nextDouble()
        double doubleVal = scanner.nextDouble();

        System.out.println("Inserisci un float:");
        // Legge un float dall'input dell'utente con nextFloat()
        float floatVal = scanner.nextFloat();

        System.out.println("Inserisci un int:");
        // Legge un int dall'input dell'utente con nextInt()
        int intVal = scanner.nextInt();

        System.out.println("Inserisci un long:");
        // Legge un long dall'input dell'utente con nextLong()
        long longVal = scanner.nextLong();

        System.out.println("Inserisci un short:");
        // Legge un short dall'input dell'utente con nextShort()
        short shortVal = scanner.nextShort();

        // Stampa i valori inseriti dall'utente
        System.out.println("\n\nHai inserito:\n");
        System.out.println("Stringa: " + stringa);
        System.out.println("Booleano: " + booleano);
        System.out.println("Byte: " + byteVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Int: " + intVal);
        System.out.println("Long: " + longVal);
        System.out.println("Short: " + shortVal);

        scanner.close();
    }
}
