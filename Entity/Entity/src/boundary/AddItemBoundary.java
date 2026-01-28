
package boundary;

import control.AddItemController;
import dao.LibraryItemDAO;
import dto.LibraryItemDTO;
import util.UIExceptionHandler;
import javax.swing.JOptionPane;

public class AddItemBoundary {
    private LibraryItemDAO dao;
    public AddItemBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show() {
        try {
            LibraryItemDTO dto = new LibraryItemDTO();
            dto.setId(Long.parseLong(JOptionPane.showInputDialog("ID")));
            dto.setTitle(JOptionPane.showInputDialog("Title"));
            dto.setType(JOptionPane.showInputDialog("Book / DVD / Magazine"));
            dto.setValue(Integer.parseInt(JOptionPane.showInputDialog("Pages / Duration / Issue")));
            AddItemController controller = new AddItemController(dao);
            controller.addItem(dto);
            UIExceptionHandler.showSuccess("Thêm tài liệu thành công!");
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}
