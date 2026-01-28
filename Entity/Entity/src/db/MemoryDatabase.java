package db;

import java.util.HashMap;
import java.util.Map;

import entity.LibraryItem;
import exception.ItemNotFoundException;
import exception.ItemRemovalFailedException;

public class MemoryDatabase {
    
    private static  Map<Long, LibraryItem> items = new HashMap<>();

    public static void insert(LibraryItem item) {
        items.put(item.getId(), item);
    }

    public static LibraryItem getById(long id) throws ItemNotFoundException {
        LibraryItem item = items.get(id);
        if (item == null) {
            throw new ItemNotFoundException("Item with id " + id + " not found");
        }
        return item;
    }

    public static Map<Long, LibraryItem> getAll() {
        return items;
    }

    public static void remove(long id) throws ItemRemovalFailedException {
        if (items.remove(id) == null) {
            throw new ItemRemovalFailedException("Item with id " + id + " does not exist");
        }
    }
}