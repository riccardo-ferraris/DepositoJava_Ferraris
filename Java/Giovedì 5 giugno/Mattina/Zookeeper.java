public class Zookeeper extends Lavoratore {
    private Zoo zoo;

    public Zookeeper(Zoo zoo) {
        this.zoo = zoo;
    }

    public void aggiungiAnimale(Animale animale) {
        if (animale instanceof Cane) {
            zoo.cani.add((Cane) animale);
        } else if (animale instanceof Gatto) {
            zoo.gatti.add((Gatto) animale);
        } else if (animale instanceof Toporagno) {
            zoo.toporagni.add((Toporagno) animale);
        }
        System.out.println("\nLo zookeeper ha aggiunto " + animale.getNome() + " allo zoo");
    }
}
