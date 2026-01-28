package control;

import dao.LibraryItemDAO;

import dto.LibraryItemDTO;
public class AddItemController {
    private LibraryItemDAO libraryItemDAOInterface;
    public AddItemController(LibraryItemDAO dao) {
        libraryItemDAOInterface = dao;
    }

    public void addItem(LibraryItemDTO dto) {
        libraryItemDAOInterface.create(dto);
    }
}