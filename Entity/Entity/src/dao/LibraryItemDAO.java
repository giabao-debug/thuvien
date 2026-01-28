package dao;

import dto.LibraryItemDTO;
import entity.LibraryItem;
import java.util.Collection;
import exception.ItemNotFoundException;
import exception.ItemRemovalFailedException;

public interface LibraryItemDAO {
    LibraryItem create(LibraryItemDTO dto);
    LibraryItem getById(long id) throws ItemNotFoundException;
    Collection<LibraryItem> getAll();
    void remove(long id) throws ItemRemovalFailedException;
    
}