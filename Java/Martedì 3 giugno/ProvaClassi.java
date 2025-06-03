import java.util.ArrayList;

public class ProvaClassi {
    public static void main(String[] args) {
        // Auto miaAuto = new Auto();
        // miaAuto.marca = "Tesla";
        // miaAuto.anno = 2023;
        // miaAuto.prezzo = 59999.99;

        // miaAuto.mostraInfo();

        // Studente io = new Studente("Riccardo");
        // System.out.println("Nome: " + io.nome);
        // System.out.println("Numero studenti: " + io.totaleStudenti);

        // Libro lib1 = new Libro("Bibbia", "Tanta gente", 20);
        // Libro lib2 = new Libro("Divina Commedia", "Dante Alighieri", 15);

        // lib1.stampaDettagli();
        // lib2.stampaDettagli();

        // Persona pers1 = new Persona("Riccardo", 23);
        // Persona pers2 = new Persona("Oreste", 125);

        // pers1.stampaDettagli();
        // pers2.stampaDettagli();

        ArrayList<Auto> autoList = new ArrayList<>();
        autoList.add(new Auto("Tesla", 2023, 39000));
        autoList.add(new Auto("Ford", 2020, 25000));

        for (Auto auto : autoList) {
            System.out.println(auto.marca + " - " + auto.anno + " - " + auto.prezzo + " euro");
        }
    }
}