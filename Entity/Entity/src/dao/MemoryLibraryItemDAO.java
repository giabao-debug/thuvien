package dao;

import java.util.Collection;
import dto.LibraryItemDTO;
import entity.Book;
import entity.DVD;
import entity.LibraryItem;
import entity.Magazine;
import exception.ItemNotFoundException;
import exception.ItemRemovalFailedException;
import db.MemoryDatabase;
public class MemoryLibraryItemDAO implements LibraryItemDAO {
    
    @Override
    public LibraryItem create(LibraryItemDTO dto) {
        LibraryItem item = null;
        switch (dto.getType()) {
            case "Book":
                item = new Book(dto.getId(), dto.getTitle(), dto.getValue());
                break;
            case "Magazine":
                item = new Magazine(dto.getId(), dto.getTitle(), dto.getValue());
                break;
            case "DVD":
                item = new DVD(dto.getId(), dto.getTitle(), dto.getValue());
                break;
            default:
                throw new IllegalArgumentException("Unknown item type: " + dto.getType());
        }
        MemoryDatabase.insert(item);
        return item;
    }
    @Override
    public LibraryItem getById(long id) throws ItemNotFoundException {
        return MemoryDatabase.getById(id);
    }
    @Override
    public Collection<LibraryItem> getAll() {
    return MemoryDatabase.getAll().values();
    }

    @Override
    public void remove(long id) throws ItemRemovalFailedException {
        MemoryDatabase.remove(id);
    }
}