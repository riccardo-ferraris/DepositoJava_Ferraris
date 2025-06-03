public class Persona {
    String nome;
    int eta;
    static String citta = "Napoli";

    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void stampaDettagli() {
        System.out.println("Nome: " + nome + "\nEtà: " + eta + "\nCittà: " + citta + "\n");
    }
}
