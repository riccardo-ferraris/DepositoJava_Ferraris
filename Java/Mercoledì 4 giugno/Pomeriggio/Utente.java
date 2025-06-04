import java.util.Random;

public class Utente {
    private String username;
    private String email;
    private float soldi;

    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
        this.soldi = randomCash();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSoldi() {
        return soldi;
    }

    public void setSoldi(float soldi) {
        this.soldi = soldi;
    }

    protected float randomCash() {
        Random rand = new Random();
        return rand.nextFloat() * 100;
    }

    public void stampaDati() {
        System.out.println("Nome: " + username);
        System.out.println("Email: " + email);
        System.out.println("Credito: " + soldi + "€");
    }

}