public class Studente {
    String nome;
    static int totaleStudenti = 0;

    Studente(String nome) {
        this.nome = nome;
        totaleStudenti++;
    }
}
