public class Libro {
    // Attributi dell'istanza: titolo, autore e prezzo del libro
    String titolo;
    String autore;
    float prezzo;

    // Attributo statico che tiene traccia del numero totale di libri creati
    static int codice_numerico_autoincrementante;

    // Costruttore della classe, inizializza i dati del libro e incrementa il
    // contatore statico ogni volta che viene creato un nuovo libro
    Libro(String titolo, String autore, float prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        codice_numerico_autoincrementante++;
    }

    // Metodo per stampare i dettagli del libro su console
    void stampaDettagli() {
        System.out.println("Titolo: " + titolo + "\nAutore: " + autore + "\nPrezzo: " + prezzo + "\n");
    }
}
