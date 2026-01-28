
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
import exception.ItemNotFoundException;

public class UpdateItemController {
    private LibraryItemDAO LibraryItemDAO;
    public UpdateItemController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public void update(LibraryItemDTO dto) throws ItemNotFoundException {
        LibraryItem item = LibraryItemDAO.getById(dto.getId());
        item.setTitle(dto.getTitle());
        item.setValue(dto.getValue());
    }
}
