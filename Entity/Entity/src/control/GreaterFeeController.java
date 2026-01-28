
package control;

import java.util.ArrayList;
import dto.LibraryItemDTO;
import dao.LibraryItemDAO;
import entity.LibraryItem;

public class GreaterFeeController {
    private LibraryItemDAO LibraryItemDAO;
    public GreaterFeeController(LibraryItemDAO dao) {
        this.LibraryItemDAO = dao;
    }
        public ArrayList<LibraryItemDTO> filter(int days) {
        ArrayList<LibraryItemDTO> result = new ArrayList<>();
    
        for (LibraryItem item : LibraryItemDAO.getAll()) {
            if (item.calculateFee(days) > 2) {
                LibraryItemDTO dto = new LibraryItemDTO();
                dto.setId(item.getId());
                dto.setTitle(item.getTitle());
                dto.setType(item.getType());
                dto.setValue(item.getValue());

                result.add(dto);
            }
        }
        return result;
    }
}