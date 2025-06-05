public class Camera {
    private int numero;
    private float prezzo;

    // Costruttore
    public Camera(int numero, float prezzo) {
        this.numero = numero;
        this.prezzo = prezzo;
    }

    // getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    // Stampa dettagli senza 'conPrezzo'
    public void dettagli() {
        System.out.println("\nNumero: " + numero + "\nPrezzo: " + prezzo);
    }

    // Stampa dettagli con 'conPrezzo'
    public void dettagli(boolean conPrezzo) {
        if (conPrezzo)
            System.out.println("\nNumero: " + numero + "\nPrezzo: " + prezzo);
        else
            System.out.println("\nNumero: " + numero);
    }
}
