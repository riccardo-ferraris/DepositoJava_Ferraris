public class Studente {
    private String nome;
    private int voto;
    private static int id = 0;

    // Costruttore
    public Studente(String nome, int voto) {
        this.nome = nome;
        this.voto = voto;
        Studente.id++;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public int getId() {
        return id;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVoto(int voto) {
        if (voto >= 0 && voto <= 10) {
            this.voto = voto;
            System.out.println("Voto cambiato correttamente. Voto attuale: " + voto);
        } else
            System.out.println("Inserisci un voto valido (tra 0 e 10)");
    }
}
