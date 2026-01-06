
package dao;

import entity.*;
import java.util.ArrayList;
import dto.LibraryItemDTO;

public class LibraryItemDAO {
    private static ArrayList<LibraryItem> items = new ArrayList<>();
    public static void add(LibraryItemDTO dto) {
        LibraryItem item;
        switch (dto.type.toLowerCase()) {
            case "book":
                item = new Book(dto.id, dto.title, dto.value);
                break;
            case "dvd":
                item = new DVD(dto.id, dto.title, dto.value);
                break;
            case "magazine":
                item = new Magazine(dto.id, dto.title, dto.value);
                break;
            default:
                return;
        }
        items.add(item);
    }

    public static ArrayList<LibraryItem> getAll() {
        return items;
    }

    public static LibraryItem findById(long id) {
        for (LibraryItem i : items)
            if (i.getId() == id) return i;
        return null;
    }

    public static boolean remove(long id) {
        LibraryItem i = findById(id);
        if (i != null) {
            items.remove(i);
            return true;
        }
        return false;
    }
}