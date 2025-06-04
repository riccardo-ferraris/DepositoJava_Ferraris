public class User {
    private String username;
    private String password;

    // getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Metodo per confrontare le password
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
