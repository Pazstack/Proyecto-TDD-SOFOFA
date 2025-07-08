package repository;

import model.Item;

import java.sql.*;
import java.util.*;

public class ItemRepository {
    private final Connection conn;

    public ItemRepository(Connection conn) {
        this.conn = conn;
    }

    public void save(Item item) throws SQLException {
        String sql = "INSERT INTO items (id, nombre, descripcion) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, item.getId());
            stmt.setString(2, item.getNombre());
            stmt.setString(3, item.getDescripcion());
            stmt.executeUpdate();
        }
    }

    public List<Item> findAll() throws SQLException {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT * FROM items";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                items.add(new Item(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("descripcion")
                ));
            }
        }
        return items;
    }

    public void update(Item item) throws SQLException {
        String sql = "UPDATE items SET nombre = ?, descripcion = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, item.getNombre());
            stmt.setString(2, item.getDescripcion());
            stmt.setInt(3, item.getId());
            stmt.executeUpdate();
        }
    }

    public void deleteById(int id) throws SQLException {
        String sql = "DELETE FROM items WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}