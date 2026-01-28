package db;

import control.AddItemController;
import dao.LibraryItemDAO;
import dao.MemoryLibraryItemDAO;
import dto.LibraryItemDTO;

public class fakedb {

    private static LibraryItemDAO db;   // ✅ DB dùng chung

    public static void load() {
        db = new MemoryLibraryItemDAO();       // ✅ GÁN VÀO BIẾN STATIC
        AddItemController control = new AddItemController(db);

        // ===== BOOKS =====
        control.addItem(dto(1, "Java OOP Basics", "Book", 120));
        control.addItem(dto(2, "Clean Code", "Book", 450));

        // ===== DVDs =====
        control.addItem(dto(8, "Inception", "DVD", 148));
        control.addItem(dto(9, "Interstellar", "DVD", 169));
        control.addItem(dto(10, "The Matrix", "DVD", 136));

        // ===== MAGAZINES =====
        control.addItem(dto(14, "Time Magazine 2024", "Magazine", 12));
        control.addItem(dto(15, "National Geographic", "Magazine", 5));
    }

    public static LibraryItemDAO getDB() {
        return db;
    }

    private static LibraryItemDTO dto(long id, String title, String type, int value) {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.setId(id);
        dto.setTitle(title);
        dto.setType(type);
        dto.setValue(value);
        return dto;
    }
}
