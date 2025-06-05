public class Veterinario extends Lavoratore {
    public void cura(Animale animale) {
        if (!animale.isSano()) {
            animale.setSano(true);
            System.out.println("\nIl veterinario ha curato " + animale.getNome());
        } else
            System.out.println("\n" + animale.getNome() + " è gia sano");
    }
}
