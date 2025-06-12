import java.sql.*;
import java.util.Map;

public class DBManager {
    private static final String URL = "jdbc:mysql://localhost:3306/Negozio";
    private static final String USER = "root";
    private static final String PASSWORD = "CTevez10";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void inserisciOrdine(int idCliente, Map<Integer, Integer> prodotti) {
        String insertOrdineSQL = "INSERT INTO Ordine (id_cliente) VALUES (?)";
        String insertProdottoSQL = "INSERT INTO Ordine_Prodotto (id_ordine, id_prodotto, quantita) VALUES (?, ?, ?)";

        try (Connection conn = getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement insertOrdine = conn.prepareStatement(insertOrdineSQL,
                    Statement.RETURN_GENERATED_KEYS);
                    PreparedStatement insertProdotto = conn.prepareStatement(insertProdottoSQL)) {

                // 1. Inserisci ordine
                insertOrdine.setInt(1, idCliente);
                insertOrdine.executeUpdate();

                ResultSet generatedKeys = insertOrdine.getGeneratedKeys();
                if (!generatedKeys.next())
                    throw new SQLException("Ordine non creato.");
                int idOrdine = generatedKeys.getInt(1);

                // 2. Inserisci prodotti associati
                for (Map.Entry<Integer, Integer> entry : prodotti.entrySet()) {
                    insertProdotto.setInt(1, idOrdine);
                    insertProdotto.setInt(2, entry.getKey());
                    insertProdotto.setInt(3, entry.getValue());
                    insertProdotto.addBatch();
                }
                insertProdotto.executeBatch();

                conn.commit();
                System.out.println("Ordine creato con successo. ID ordine: " + idOrdine);

            } catch (SQLException e) {
                conn.rollback();
                System.err.println("Errore, ordine annullato.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void visualizzaStoricoCliente(int idCliente) {
        String sql = """
                    SELECT o.id AS ordine_id, o.data_ordine, o.stato,
                           p.nome AS prodotto, op.quantita, p.prezzo,
                           (op.quantita * p.prezzo) AS totale
                    FROM Ordine o
                    JOIN Ordine_Prodotto op ON o.id = op.id_ordine
                    JOIN Prodotto p ON op.id_prodotto = p.id
                    WHERE o.id_cliente = ?
                    ORDER BY o.data_ordine DESC, o.id, p.nome
                """;

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCliente);
            ResultSet rs = stmt.executeQuery();

            int ordineCorrente = -1;
            double totaleOrdine = 0.0;

            while (rs.next()) {
                int ordineId = rs.getInt("ordine_id");

                // Nuovo ordine, stampa riepilogo di quello precedente
                if (ordineId != ordineCorrente) {
                    if (ordineCorrente != -1) {
                        System.out.printf("Totale ordine: %.2f euro %n", totaleOrdine);
                    }

                    ordineCorrente = ordineId;
                    totaleOrdine = 0.0;

                    System.out.println("\n--- Ordine #" + ordineId + " ---");
                    System.out.println("Data: " + rs.getTimestamp("data_ordine") +
                            " | Stato: " + rs.getString("stato"));
                    System.out.println("Prodotti:");
                }

                String prodotto = rs.getString("prodotto");
                int quantita = rs.getInt("quantita");
                double prezzo = rs.getDouble("prezzo");
                double totale = rs.getDouble("totale");

                System.out.printf("  - %s x%d @ %.2f euro -> %.2f euro %n",
                        prodotto, quantita, prezzo, totale);

                totaleOrdine += totale;
            }

            // Stampa il totale dell'ultimo ordine
            if (ordineCorrente != -1) {
                System.out.printf("Totale ordine: %.2f euro %n", totaleOrdine);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void aggiornaStatoOrdine(int idOrdine, String nuovoStato) {
        String sql = "UPDATE Ordine SET stato = ? WHERE id = ?";

        try (Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nuovoStato);
            stmt.setInt(2, idOrdine);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Stato aggiornato.");
            } else {
                System.out.println("Ordine non trovato.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
