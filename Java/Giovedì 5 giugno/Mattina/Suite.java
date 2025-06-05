public class Suite extends Camera {
    private String serviziExtra;

    // Costruttore
    public Suite(int numero, float prezzo, String serviziExtra) {
        super(numero, prezzo);
        this.serviziExtra = serviziExtra;
    }

    // getters e setters
    public String getServiziExtra() {
        return serviziExtra;
    }

    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    // Metodo dettagli overridato
    @Override
    public void dettagli() {
        System.out
                .println("\nNumero: " + getNumero() + "\nPrezzo: " + getPrezzo() + "\nServizi extra: " + serviziExtra);
    }
}
