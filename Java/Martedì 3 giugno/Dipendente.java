public class Dipendente {
    private String nome;
    private int stipendio;
    private String dipartimento;

    // Costruttore dipendente
    Dipendente(String nome, int stipendio, String dipartimento) {
        this.nome = nome;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Metodi setter per modificare attributi
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Metodo di stampa
    void stampaDettagli() {
        System.out.println("Nome: " + nome + "\nStipendio: " + stipendio + "\nDipartimento: " + dipartimento + "\n");
    }
}
