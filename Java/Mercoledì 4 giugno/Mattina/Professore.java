import java.util.ArrayList;

public class Professore {
    private String nome;

    // Costruttore
    public Professore(String nome) {
        this.nome = nome;
    }

    // getters
    public String getNome() {
        return nome;
    }

    // Metodo per visualizzare studenti
    public void visualizzaStudenti(ArrayList<Studente> studenti) {
        System.out.println("\nElenco studenti:");
        for (Studente s : studenti) {
            System.out.println("Nome: " + s.getNome() + ", Voto: " + s.getVoto());
        }
    }

    // Metodo per cambiare voto allo studente
    public void cambiaVotoStudente(ArrayList<Studente> studenti, String nomeStudente, int nuovoVoto) {
        for (Studente s : studenti) {
            if (s.getNome().equalsIgnoreCase(nomeStudente)) {
                s.setVoto(nuovoVoto);
                return;
            }
        }
        System.out.println("Studente " + nomeStudente + " non trovato.");
    }

    // Metodo per la ricerca per nome
    public boolean cercaPerNome(String nome, ArrayList<Studente> studenti) {
        for (Studente studente : studenti) {
            if (studente.getNome().equals(nome)) {
                System.out.println("Utente " + nome + " trovato. Ha un voto pari a " + studente.getVoto());
                return true;
            }
        }

        System.out.println("Utente " + nome + " non trovato.");
        return false;
    }
}
