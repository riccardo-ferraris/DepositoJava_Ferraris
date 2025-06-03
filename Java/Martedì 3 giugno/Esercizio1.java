import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scelta = 0; // Variabile per memorizzare la scelta dell'utente nel menù

        // Ciclo che continua a mostrare il menù finché l'utente non sceglie di uscire
        // (scelta == 5)
        while (scelta != 5) {
            // Stampa del menù principale
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Somma di due numeri");
            System.out.println("2 - (Non ancora implementata)");
            System.out.println("3 - Somma ricorsiva dei numeri naturali");
            System.out.println("4 - Passaggio per valore e per riferimento");
            System.out.println("5 - Esci");
            System.out.print("Inserisci una scelta (1-5): ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    // Esercizio 1: somma di due numeri float
                    System.out.println("Inserisci primo numero");
                    float firstNum = sc.nextFloat();

                    System.out.println("Inserisci il secondo numero");
                    float secondNum = sc.nextFloat();

                    // Chiamata del metodo somma(float, float)
                    float res = somma(firstNum, secondNum);

                    System.out.println("La somma dei due numeri è " + res);
                    break;

                case 2:
                    System.out.println("Funzione non disponibile.");
                    break;

                case 3:
                    // Esercizio 3: somma ricorsiva dei primi n numeri naturali
                    System.out.println("Inserisci un intero positivo");
                    int num = sc.nextInt();

                    // Controllo sull’input
                    if (num < 1) {
                        System.out.println("Numero non valido. Inserire un intero positivo!");
                    } else {
                        // Chiamata alla funzione ricorsiva
                        System.out.println("La somma dei primi " + num + " numeri naturali è " + sommaNaturali(num));
                    }
                    break;

                case 4:
                    // Esercizio 4: dimostrazione di passaggio per valore e riferimento
                    int val = 5;
                    int[] arr = { 10, 20, 30 };

                    // Passaggio per valore (non modifica la variabile originale)
                    System.out.println("Valore prima della modifica per valore: " + val);
                    modificaValore(val);
                    System.out.println("Valore dopo la modifica per valore: " + val);

                    // Passaggio per riferimento (modifica l'oggetto originale)
                    System.out.println("Valore di arr[0] prima della modifica per riferimento: " + arr[0]);
                    modificaRiferimento(arr);
                    System.out.println("Valore di arr[0] dopo la modifica per riferimento: " + arr[0]);
                    break;

                case 5:
                    // Uscita dal programma
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    // Gestione di input non validi
                    System.out.println("Scelta non valida. Riprova!");
            }
        }

        sc.close();
    }

    // Metodo che restituisce la somma di due numeri float
    static float somma(float a, float b) {
        return a + b;
    }

    // Metodo ricorsivo che calcola la somma dei primi n numeri naturali
    static int sommaNaturali(int num) {
        if (num == 1) // Caso base: sommaNaturali(1) = 1
            return 1;
        // Chiamata ricorsiva: sommaNaturali(n) = n + sommaNaturali(n - 1)
        return num + sommaNaturali(num - 1);
    }

    // Metodo che modifica una variabile per valore
    static void modificaValore(int a) {
        a += 10;
    }

    // Metodo che modifica il contenuto di un array
    static void modificaRiferimento(int[] a) {
        a[0] = 999;
    }
}
