
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
import exception.ItemNotFoundException;

public class ViewDetaiController {
    private LibraryItemDAO LibraryItemDAO;
    public ViewDetaiController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public LibraryItemDTO viewDetail(long id) throws ItemNotFoundException
    {
       LibraryItem item = LibraryItemDAO.getById(id);
        LibraryItemDTO dto = new LibraryItemDTO();
        dto.setId(item.getId());
        dto.setTitle(item.getTitle());
        dto.setType(item.getType());
        dto.setValue(item.getValue());

        return dto;
    }
}