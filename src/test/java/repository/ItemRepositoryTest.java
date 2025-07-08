package repository;

import config.DBConnection;
import model.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemRepositoryTest {
    private Connection conn;
    private ItemRepository repository;

    @BeforeEach
    void setUp() throws SQLException {
        conn = DBConnection.getConnection();
        conn.createStatement().execute("CREATE TABLE items (id INTEGER, nombre TEXT, descripcion TEXT)");
        repository = new ItemRepository(conn);
    }

    @Test
    void testGuardarYListarItem() throws SQLException {
        Item item = new Item(1, "Lapicera", "Azul y retráctil");
        repository.save(item);

        List<Item> resultados = repository.findAll();
        assertEquals(1, resultados.size());
        assertEquals("Lapicera", resultados.get(0).getNombre());
    }
}