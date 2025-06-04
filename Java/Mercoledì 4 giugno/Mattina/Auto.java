public class Auto {
    private String targa;
    private String modello;

    public Auto(String targa, String modello) {
        this.targa = targa;
        this.modello = modello;
    }

    // getters
    public String getTarga() {
        return this.targa;
    }

    public String getModello() {
        return this.modello;
    }

    // setters
    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
}
