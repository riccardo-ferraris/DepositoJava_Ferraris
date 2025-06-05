public class Gatto extends Animale {
    public Gatto(String nome, int eta, boolean sano) {
        super(nome, eta, sano);
    }

    @Override
    public void faiVerso() {
        System.out.println("Miao!");
    }
}
