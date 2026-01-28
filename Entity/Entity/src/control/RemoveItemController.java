package control;

import dao.LibraryItemDAO;
import exception.ItemRemovalFailedException;

public class RemoveItemController {
    private LibraryItemDAO LibraryItemDAO;
    public RemoveItemController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public void removeItem(long id) throws ItemRemovalFailedException {
        LibraryItemDAO.remove(id);
    }
}
