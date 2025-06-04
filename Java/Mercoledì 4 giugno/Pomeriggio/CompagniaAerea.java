import java.util.ArrayList;

public class CompagniaAerea {
    private String nome;
    private ArrayList<Aereo> flotta = new ArrayList<>();
    private ArrayList<Pilota> piloti = new ArrayList<>();

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aereo> getFlotta() {
        return flotta;
    }

    public void setFlotta(ArrayList<Aereo> flotta) {
        this.flotta = flotta;
    }

    public ArrayList<Pilota> getPiloti() {
        return piloti;
    }

    public void setPiloti(ArrayList<Pilota> piloti) {
        this.piloti = piloti;
    }

    // Metodo per aggiungere aereo a flotta
    public void addAereo(Aereo aereo) {
        flotta.add(aereo);
    }

    // Metodo per aggiungere pilota a piloti
    public void addPilota(Pilota pilota) {
        piloti.add(pilota);
    }

    // Metodo per stampare info di tutti i piloti e aerei
    public void printPilotiEAerei() {
        System.out.println("\n---- PILOTI ----");
        for (Pilota pilota : piloti) {
            stampaInfoPilota(pilota);
        }
        System.out.println("\n---- AEREI ----");
        for (Aereo aereo : flotta) {
            stampaInfoAereo(aereo);
        }
    }

    // Metodo per ricerca dell'aereo per modello
    public void ricercaModelloAereo(String modello) {
        for (Aereo aereo : flotta) {
            if (aereo.getModello().equalsIgnoreCase(modello)) {
                System.out.println("\nAereo modello " + modello + " trovato");
                stampaInfoAereo(aereo);
                return;
            }
        }
        System.out.println("\nAereo modello " + modello + " non trovato");
    }

    // Metodo per ricerca del pilota per nome
    public void ricercaNomePilota(String nome) {
        for (Pilota pilota : piloti) {
            if (pilota.getNome().equalsIgnoreCase(nome)) {
                System.out.println("\nPilota di nome " + nome + " trovato");
                stampaInfoPilota(pilota);
                return;
            }
        }
        System.out.println("\nPilota di nome " + nome + " non trovato");
    }

    // Metodo per ricerca dell'aereo per codice
    public void ricercaCodiceAereo(String codice) {
        for (Aereo aereo : flotta) {
            if (aereo.getCodice().equalsIgnoreCase(codice)) {
                System.out.println("\nAereo con codice " + codice + " trovato");
                stampaInfoAereo(aereo);
                return;
            }
        }
        System.out.println("\nAereo con codice " + codice + " non trovato");
    }

    // Metodo per ricerca del pilota per numero di brevetto
    public void ricercaNumeroBrevettoPilota(String numeroBrevetto) {
        for (Pilota pilota : piloti) {
            if (pilota.getNumeroBrevetto().equalsIgnoreCase(numeroBrevetto)) {
                System.out.println("\nPilota con numero di brevetto " + numeroBrevetto + " trovato");
                stampaInfoPilota(pilota);
                return;
            }
        }
        System.out.println("\nPilota con numero di brevetto " + numeroBrevetto + " non trovato");
    }

    // Metodo per stampa info pilota
    public void stampaInfoPilota(Pilota pilota) {
        System.out.println("\nNome: " + pilota.getNome());
        System.out.println("Numero brevetto: " + pilota.getNumeroBrevetto());
        System.out.println("Ore di volo: " + pilota.getOreVolo());
    }

    // Metodo per stampa info aereo
    public void stampaInfoAereo(Aereo aereo) {
        System.out.println("\nModello: " + aereo.getModello());
        System.out.println("Numero posti: " + aereo.getNumeroPosti());
        System.out.println("Codice: " + aereo.getCodice());
    }
}
