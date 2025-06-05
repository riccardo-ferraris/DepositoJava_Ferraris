import java.util.ArrayList;

public class MainAnimale {
    public static void main(String[] args) {

        // -------------- Esercizio base --------------
        ArrayList<Animale> animali = new ArrayList<>();
        Zoo zoo = new Zoo();

        Cane cane1 = new Cane("Bobby", 8, true);
        Cane cane2 = new Cane("Fandonio", 5, false);
        Cane cane3 = new Cane("Raffaele", 14, true);

        Gatto gatto1 = new Gatto("Federico Gatti", 3, true);
        Gatto gatto2 = new Gatto("Del Piero", 7, true);
        Gatto gatto3 = new Gatto("Berto", 10, false);

        Toporagno toporagno1 = new Toporagno("Donatello", 2, false);
        Toporagno toporagno2 = new Toporagno("Michelangelo", 43, false);
        Toporagno toporagno3 = new Toporagno("Leonardo", 33, false);

        animali.add(cane1);
        animali.add(cane2);
        animali.add(cane3);

        animali.add(gatto1);
        animali.add(gatto2);
        animali.add(gatto3);

        animali.add(toporagno1);
        animali.add(toporagno2);
        animali.add(toporagno3);

        for (Animale animale : animali) {
            animale.stampaInfo();
        }

        zoo.cani.add(cane1);
        zoo.cani.add(cane2);
        zoo.cani.add(cane3);

        zoo.gatti.add(gatto1);
        zoo.gatti.add(gatto2);
        zoo.gatti.add(gatto3);

        zoo.toporagni.add(toporagno1);
        zoo.toporagni.add(toporagno2);
        zoo.toporagni.add(toporagno3);

        // -------------- Esercizio extra --------------
        Veterinario vet = new Veterinario();
        vet.cura(cane2);
        vet.cura(gatto1);

        Zookeeper keeper = new Zookeeper(zoo);
        Cane nuovoCane = new Cane("Doggo", 2, true);
        keeper.aggiungiAnimale(nuovoCane);
    }
}
