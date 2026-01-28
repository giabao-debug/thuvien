
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import java.util.ArrayList;
import entity.LibraryItem;

public class SearchItemController {
    private LibraryItemDAO LibraryItemDAO;
    public SearchItemController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
    public ArrayList<LibraryItemDTO> search(String key) {
        ArrayList<LibraryItemDTO> rs = new ArrayList<>();

        for (LibraryItem i : LibraryItemDAO.getAll()) {
            if (i.getTitle().toLowerCase().contains(key.toLowerCase())) {

                LibraryItemDTO dto = new LibraryItemDTO();
                dto.setId(i.getId());
                dto.setTitle(i.getTitle());
                dto.setType(i.getType());
                dto.setValue(i.getValue());

                rs.add(dto);
            }
        }
        return rs;
    }
}