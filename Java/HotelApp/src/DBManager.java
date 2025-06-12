import java.sql.*;

public class DBManager {
    private static final String URL = "jdbc:mysql://localhost:3306/HotelDB";
    private static final String USER = "root";
    private static final String PASSWORD = "CTevez10";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void inserisciOspite(String nome, String cognome, String email, String telefono) {
        String sql = "INSERT INTO Utente (nome, cognome, email, telefono) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cognome);
            stmt.setString(3, email);
            stmt.setString(4, telefono);
            stmt.executeUpdate();
            System.out.println("Ospite inserito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void effettuaPrenotazione(int idUtente, int idCamera, String checkin, String checkout) {
        String sql = "INSERT INTO Prenotazione (id_utente, id_camera, data_checkin, data_checkout) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUtente);
            stmt.setInt(2, idCamera);
            stmt.setDate(3, Date.valueOf(checkin));
            stmt.setDate(4, Date.valueOf(checkout));
            stmt.executeUpdate();
            System.out.println("Prenotazione effettuata.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void visualizzaPrenotazioni() {
        String sql = """
                SELECT p.id, u.nome, u.cognome, c.numero_camera, p.data_checkin, p.data_checkout
                FROM Prenotazione p
                JOIN Utente u ON p.id_utente = u.id
                JOIN Camera c ON p.id_camera = c.id
                """;

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("Prenotazione %d: %s %s - Camera %s - dal %s al %s%n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("numero_camera"),
                        rs.getDate("data_checkin"),
                        rs.getDate("data_checkout"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void stampaTuttiGliOspiti() {
        String sql = "SELECT id, nome, cognome, email, telefono, data_registrazione FROM Utente";

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n===== Elenco Ospiti =====");
            while (rs.next()) {
                System.out.printf("ID: %d | Nome: %s %s | Email: %s | Telefono: %s | Registrato il: %s%n",
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("email"),
                        rs.getString("telefono"),
                        rs.getTimestamp("data_registrazione").toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
