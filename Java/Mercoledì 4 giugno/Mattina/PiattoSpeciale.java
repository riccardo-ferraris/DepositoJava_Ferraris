import java.util.HashMap;

public class PiattoSpeciale {
    private HashMap<String, Double> pani = new HashMap<>();

    public HashMap<String, Double> getPane() {
        return pani;
    }

    public void setPane(String nomePane, double prezzoPane) {
        pani.put(nomePane, prezzoPane);
    }

    public HashMap<String, Double> ingredienti = new HashMap<>();

    public double calcTot() {
        double tot = 1.0;
        for (String pane : pani.keySet()) {
            tot += pani.get(pane);
        }
        for (String ingrediente : ingredienti.keySet()) {
            tot += ingredienti.get(ingrediente);
        }
        return tot;
    }
}
