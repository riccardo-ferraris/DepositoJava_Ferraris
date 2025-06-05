public class Animale {
    private String nome;
    private int eta;
    private boolean sano;

    public Animale(String nome, int eta, boolean sano) {
        this.nome = nome;
        this.eta = eta;
        this.sano = sano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public void faiVerso() {
        System.out.println("Verso generico...");
    }

    public void stampaInfo() {
        System.out.println("\nNome: " + nome + "\nEtà: " + eta + "\nSano: " + sano);
        System.out.print("Verso: ");
        faiVerso();
    }
}