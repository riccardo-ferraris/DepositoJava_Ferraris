public class Chef extends Utente {
    private int piattiCreati = 0;

    public Chef(String nome, String email) {
        super(nome, email);
    }

    public void creaPiatto(Ristorante ristorante, String piatto) {
        ristorante.aggiungiPiatto(piatto);
        piattiCreati++;
        verificaPromozione();
    }

    private void verificaPromozione() {
        if (piattiCreati >= 3) {
            System.out.println(super.getUsername() + " è ora Chef Capo!");
        }
    }
}