
package boundary;

import control.RemoveItemController;
import dao.LibraryItemDAO;
import util.UIExceptionHandler;
import javax.swing.JOptionPane;

public class RemoveItemBoundary {
    private LibraryItemDAO dao;
    public RemoveItemBoundary(LibraryItemDAO dao) {
        this.dao = dao;
    }
    public void show() {
        try {
            long id = Long.parseLong(JOptionPane.showInputDialog("Nhap ID can xoa: "));
            new RemoveItemController(dao).removeItem(id);
            UIExceptionHandler.showSuccess("Xóa tài liệu thành công!");
        } catch (Exception e) {
            UIExceptionHandler.handleException(e);
        }
    }
}