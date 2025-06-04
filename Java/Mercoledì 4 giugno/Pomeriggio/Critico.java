public class Critico extends Utente {
    private int recensioniFatte = 0;

    public Critico(String nome, String email) {
        super(nome, email);
    }

    public void lasciaRecensione(Ristorante ristorante, String recensione) {
        ristorante.aggiungiValutazione(recensione);
        recensioniFatte++;
        verificaPromozione();
    }

    private void verificaPromozione() {
        if (recensioniFatte >= 3) {
            System.out.println(super.getUsername() + " è ora Critico Forte!");
        }
    }
}