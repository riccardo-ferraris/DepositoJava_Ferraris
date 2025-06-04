import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private List<String> piatti = new ArrayList<>();
    private List<String> valutazioni = new ArrayList<>();

    public void aggiungiPiatto(String piatto) {
        piatti.add(piatto);
    }

    public void aggiungiValutazione(String valutazione) {
        valutazioni.add(valutazione);
    }

    public void stampaMenu() {
        System.out.println("Menu del ristorante:");
        for (String piatto : piatti) {
            System.out.println("- " + piatto);
        }
    }

    public void stampaValutazioni() {
        System.out.println("Recensioni:");
        for (String recensione : valutazioni) {
            System.out.println("* " + recensione);
        }
    }
}
