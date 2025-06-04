public class Aereo {
    private String modello;
    private int numeroPosti;
    private String codice;

    // Costruttore
    public Aereo(String modello, int numeroPosti, String codice) {
        this.modello = modello;
        this.numeroPosti = numeroPosti;
        this.codice = codice;
    }

    // getters e setters
    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

}