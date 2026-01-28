package db;

import java.io.*;
import java.util.*;
import entity.LibraryItem;
import exception.ItemNotFoundException;
import exception.ItemRemovalFailedException;

public class FileDatabase {
    
    private static  String DATABASE_FILE = "database.db";
    private static Map<Long, LibraryItem> items = new HashMap<>();
    
    static {
        loadFromFile();
    }
    
    /**
     * Load data from database.db file using Java ObjectInputStream
     */
    private static void loadFromFile() {
        File file = new File(DATABASE_FILE);
        if (!file.exists()) {
            items = new HashMap<>();
            return;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            @SuppressWarnings("unchecked")
            Map<Long, LibraryItem> loadedItems = (Map<Long, LibraryItem>) ois.readObject();
            items = loadedItems != null ? loadedItems : new HashMap<>();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading from database: " + e.getMessage());
            items = new HashMap<>();
        }
    }
    
    /**
     * Save data to database.db file using Java ObjectOutputStream
     */
    private static void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATABASE_FILE))) {
            oos.writeObject(items);
            oos.flush();
        } catch (IOException e) {
            System.err.println("Error saving to database: " + e.getMessage());
        }
    }
    
    public static void insert(LibraryItem item) {
        items.put(item.getId(), item);
        saveToFile();
    }
    
    public static LibraryItem getById(long id) throws ItemNotFoundException {
        LibraryItem item = items.get(id);
        if (item == null) {
            throw new ItemNotFoundException("Item with id " + id + " not found");
        }
        return item;
    }
    
    public static Map<Long, LibraryItem> getAll() {
        return new HashMap<>(items);
    }
    
    public static void remove(long id) throws ItemRemovalFailedException {
        if (items.remove(id) == null) {
            throw new ItemRemovalFailedException("Item with id " + id + " does not exist");
        }
        saveToFile();
    }
    
    /**
     * Clear all data (useful for testing)
     */
    public static void clear() {
        items.clear();
        saveToFile();
    }
}