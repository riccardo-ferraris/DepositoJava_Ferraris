public class Toporagno extends Animale {

    public Toporagno(String nome, int eta, boolean sano) {
        super(nome, eta, sano);
    }

    @Override
    public void faiVerso() {
        System.out.println("Gneeeeee!");
    }
}
