
package control;

import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import entity.LibraryItem;
import java.util.ArrayList;
public class ListAllController {
    public ArrayList<LibraryItemDTO> listAll() {
        ArrayList<LibraryItemDTO> result = new ArrayList<>();

        for (LibraryItem item : LibraryItemDAO.getAll()) {
            LibraryItemDTO dto = new LibraryItemDTO();
            dto.id = item.getId();
            dto.title = item.getTitle();
            dto.type = item.getType();
            dto.value = item.getValue();

            result.add(dto);
        }
        return result;
    }
}