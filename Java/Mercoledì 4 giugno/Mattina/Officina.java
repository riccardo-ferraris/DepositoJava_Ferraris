import java.util.ArrayList;

public class Officina {
    private ArrayList<Auto> list = new ArrayList<>();

    // getters
    public ArrayList<Auto> getList() {
        return list;
    }

    public void addAuto(Auto auto) {
        list.add(auto);
    }

    // Metodo per rimuovere auto dall'officina
    public boolean removeAuto(String targa) {
        for (Auto auto : list) {
            if (auto.getTarga().equalsIgnoreCase(targa)) {
                list.remove(auto);
                System.out.println("Auto con targa " + targa + " rimossa con successo");
                return true;
            }
        }
        System.out.println("Auto non trovata");
        return false;
    }

    // Metodo per stampare la lista di auto
    public void printList() {
        for (Auto auto : list) {
            System.out.println("\nTarga: " + auto.getTarga() + "\nModello: " + auto.getModello());
        }
    }
}
