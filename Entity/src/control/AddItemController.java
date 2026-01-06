package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;

public class AddItemController {
    public void addItem(LibraryItemDTO dto) {
        LibraryItemDAO.add(dto);
    }
}