public class Cane extends Animale {
    public Cane(String nome, int eta, boolean sano) {
        super(nome, eta, sano);
    }

    @Override
    public void faiVerso() {
        System.out.println("Bau!");
    }
}
