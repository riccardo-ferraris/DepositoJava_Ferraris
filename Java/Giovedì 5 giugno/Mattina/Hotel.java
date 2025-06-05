import java.util.ArrayList;

public class Hotel {
    private String nome;
    private ArrayList<Camera> camere = new ArrayList<>();

    // Costruttore
    public Hotel(String nome) {
        this.nome = nome;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }

    public void setCamere(ArrayList<Camera> camere) {
        this.camere = camere;
    }

    // Metodo per aggiungere una camera all'hotel
    public void addCamera(Camera camera) {
        camere.add(camera);
    }

    // Metodo che conta le suite dell'hotel
    public static int contaSuite(ArrayList<Camera> camere) {
        int i = 0;
        for (Camera camera : camere) {
            if (camera instanceof Suite)
                i++;
        }

        return i;
    }
}
