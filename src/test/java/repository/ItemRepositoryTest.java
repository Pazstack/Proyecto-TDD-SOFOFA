package repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import model.Item;
import config.DBConnection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void testActualizarItem() throws SQLException {
        Item item = new Item(2, "Cuaderno", "Tapa blanda");
        repository.save(item);

        item.setNombre("Cuaderno grande");
        item.setDescripcion("Tapa dura");
        repository.update(item);

        List<Item> resultados = repository.findAll();
        assertEquals("Cuaderno grande", resultados.get(0).getNombre());
        assertEquals("Tapa dura", resultados.get(0).getDescripcion());
    }

    @Test
    void testEliminarItem() throws SQLException {
        Item item1 = new Item(10, "Regla", "30cm");
        Item item2 = new Item(20, "Goma", "Blanca");
        repository.save(item1);
        repository.save(item2);

        repository.deleteById(10);

        List<Item> resultados = repository.findAll();
        assertEquals(1, resultados.size());
        assertEquals("Goma", resultados.get(0).getNombre());
    }
}