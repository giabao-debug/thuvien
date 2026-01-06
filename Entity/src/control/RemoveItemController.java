package control;

import dao.LibraryItemDAO;

public class RemoveItemController {
    public boolean removeItem(long id) {
        return LibraryItemDAO.remove(id);
    }
}
