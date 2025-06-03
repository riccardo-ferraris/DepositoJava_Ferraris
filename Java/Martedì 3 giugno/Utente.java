public class Utente {
    private String nome;
    private BankAccount account;

    // Metodi getters
    public String getNome() {
        return this.nome;
    }

    public BankAccount getBankAccount() {
        return this.account;
    }

    // Metodi setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBankAccount(BankAccount account) {
        this.account = account;
    }

    // Costruttore
    public Utente(String nome, BankAccount account) {
        this.nome = nome;
        this.account = account;
    }
}
