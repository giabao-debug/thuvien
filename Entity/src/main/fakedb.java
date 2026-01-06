
package main;

import control.AddItemController;
import dto.LibraryItemDTO;


public class fakedb {

    public static void load() {
        AddItemController control = new AddItemController();

        // ===== BOOKS =====
        control.addItem(dto(1, "Java OOP Basics", "Book", 120));
        control.addItem(dto(2, "Clean Code", "Book", 450));
        control.addItem(dto(3, "Design Patterns", "Book", 395));
        control.addItem(dto(4, "Data Structures", "Book", 300));
        control.addItem(dto(5, "Operating Systems", "Book", 500));
        control.addItem(dto(6, "Computer Networks", "Book", 420));
        control.addItem(dto(7, "Database Systems", "Book", 380));

        // ===== DVDs =====
        control.addItem(dto(8, "Inception", "DVD", 148));
        control.addItem(dto(9, "Interstellar", "DVD", 169));
        control.addItem(dto(10, "The Matrix", "DVD", 136));
        control.addItem(dto(11, "Avengers Endgame", "DVD", 181));
        control.addItem(dto(12, "The Dark Knight", "DVD", 152));
        control.addItem(dto(13, "Parasite", "DVD", 132));

        // ===== MAGAZINES =====
        control.addItem(dto(14, "Time Magazine 2024", "Magazine", 12));
        control.addItem(dto(15, "National Geographic", "Magazine", 5));
        control.addItem(dto(16, "Forbes Asia", "Magazine", 8));
        control.addItem(dto(17, "Science Weekly", "Magazine", 20));
        control.addItem(dto(18, "Tech Today", "Magazine", 3));
        control.addItem(dto(19, "AI Monthly", "Magazine", 15));
        control.addItem(dto(20, "Business Insider", "Magazine", 10));
    }

    private static LibraryItemDTO dto(long id, String title, String type, int value) {
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.id = id;
        dto.title = title;
        dto.type = type;
        dto.value = value;
        return dto;
    }
}