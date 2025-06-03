public class Auto {
    String marca;
    int anno;
    double prezzo;

    Auto(String marca, int anno, double prezzo) {
        this.marca = marca;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    void mostraInfo() {
        System.out.println(marca + " - " + anno + " - " + prezzo + " euro");
    }
}
